package com.github.iphase2.accountbiz.eo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: Account
 * @Author iPhase2
 * @Date 2023/5/1 14:41
 * @description:
 */

@Data
@TableName("d_account")
public class Account {
    private Long id;
    private BigDecimal amount;
    private String name;
}
