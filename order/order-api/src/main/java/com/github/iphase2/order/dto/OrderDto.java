package com.github.iphase2.order.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: OrderDto
 * @Author iPhase2
 * @Date 2023/5/1 14:46
 * @description:
 */
@Data
public class OrderDto {
    private Long id;
    private String orderNo;
    private Long userId;
    private Integer count;
    /**
     * 订单金额
     */
    private BigDecimal amount;
}
