package com.github.iphase2.order.api;

import com.github.iphase2.order.dto.OrderDto;
import com.github.iphase2.order.dto.SubmitInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Title: OrderApi
 * @Author iPhase2
 * @Date 2023/4/30 20:37
 * @description:
 */
@FeignClient(name = "order-service", url = "${order.service.url:}", path = "/v1/order")
public interface OrderApi {

    @PostMapping("add")
    Boolean addOrder(@RequestBody OrderDto dto);

    @PostMapping("submitOrder")
    Boolean submitOrder(@RequestBody SubmitInfoDto dto);
}
