package com.github.iphase2.order.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: SubmitInfoDto
 * @Author iPhase2
 * @Date 2023/5/1 16:06
 * @description:
 */
@Data
public class SubmitInfoDto {

    /**
     * 商品id
     */
    private Long itemId;
    /**
     * 下单数量
     */
    private Integer count;
    private String orderNo;
    private Long userId;
    /**
     * 商品单价金额
     */
    private BigDecimal amount;
}
