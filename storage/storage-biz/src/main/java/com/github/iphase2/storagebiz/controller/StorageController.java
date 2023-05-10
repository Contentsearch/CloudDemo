package com.github.iphase2.storagebiz.controller;

import com.github.iphase2.order.api.OrderApi;
import com.github.iphase2.storage.api.StorageApi;
import com.github.iphase2.storage.dto.StorageDto;
import com.github.iphase2.storagebiz.eo.Storage;
import com.github.iphase2.storagebiz.mapper.StorageMapper;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Optional;

/**
 * @Title: StorageController
 * @Author iPhase2
 * @Date 2023/5/1 12:50
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("/v1/storage")
public class StorageController implements StorageApi {

    @Resource
    private StorageMapper storageMapper;
    @Resource
    private OrderApi orderApi;

    @Override
//    @Transactional(rollbackFor = Exception.class)
    public Boolean subtractStorage(Long id, String num) {
        log.info("Seata全局事务id=======storage==========>{}", RootContext.getXID());
        Storage dbStorage = storageMapper.selectById(id);

        Storage storage = new Storage();
        storage.setId(id);
        storage.setNum(Optional.ofNullable(dbStorage.getNum()).orElse(BigDecimal.ZERO).subtract(new BigDecimal(num)));
        storageMapper.updateById(storage);
        return Boolean.TRUE;
    }

    @Override
    public Boolean addStorage(StorageDto dto) {
        Storage storage = new Storage();

        BeanUtils.copyProperties(dto, storage);
        storageMapper.insert(storage);
        return Boolean.TRUE;
    }
}
