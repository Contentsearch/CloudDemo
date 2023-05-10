package com.github.iphase2.orderbiz.controller;

import com.github.iphase2.account.api.AccountApi;
import com.github.iphase2.account.dto.AccountDto;
import com.github.iphase2.order.api.OrderApi;
import com.github.iphase2.order.dto.OrderDto;
import com.github.iphase2.order.dto.SubmitInfoDto;
import com.github.iphase2.orderbiz.eo.Order;
import com.github.iphase2.orderbiz.mapper.OrderMapper;
import com.github.iphase2.storage.api.StorageApi;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Title: OrderController
 * @Author iPhase2
 * @Date 2023/5/1 12:50
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("/v1/order")
public class OrderController implements OrderApi {

    @Resource
    private OrderMapper OrderMapper;
    @Resource
    private StorageApi storageApi;

    @Resource
    private AccountApi accountApi;

    @Override
    public Boolean addOrder(OrderDto dto) {
        Order order = new Order();
        BeanUtils.copyProperties(dto, order);
        OrderMapper.insert(order);
        return Boolean.TRUE;
    }

    @Override
    @GlobalTransactional
    public Boolean submitOrder(SubmitInfoDto dto) {
        log.info("Seata全局事务id======order===========>{}", RootContext.getXID());
        OrderDto orderDto = new OrderDto();
        orderDto.setOrderNo("DD" + System.currentTimeMillis());
        orderDto.setCount(dto.getCount());
        BigDecimal totalAmount = dto.getAmount().multiply(new BigDecimal(dto.getCount()));
        orderDto.setAmount(totalAmount);
        orderDto.setUserId(dto.getUserId());
        addOrder(orderDto);
        // 扣减库存
        Boolean storageResult = storageApi.subtractStorage(dto.getItemId(), String.valueOf(dto.getCount()));
        // 扣减余额
        AccountDto accountDto = new AccountDto();
        accountDto.setAmount(totalAmount);
        accountDto.setId(dto.getUserId());
        accountApi.updateAccount(accountDto);
//        int a = 1/0;
        return storageResult;
    }
}
