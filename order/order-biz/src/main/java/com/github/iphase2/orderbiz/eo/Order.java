package com.github.iphase2.orderbiz.eo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: Order
 * @Author iPhase2
 * @Date 2023/5/1 14:36
 * @description:
 */
@Data
@TableName("d_order")
public class Order {
    private Long id;
    @TableField("order_no")
    private String orderNo;
    @TableField("user_id")
    private Long userId;
    private Integer count;
    /**
     * 订单金额
     */
    private BigDecimal amount;
}
