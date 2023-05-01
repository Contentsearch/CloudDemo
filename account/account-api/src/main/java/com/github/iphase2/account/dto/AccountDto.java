package com.github.iphase2.account.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Title: AccountDto
 * @Author iPhase2
 * @Date 2023/5/1 15:19
 * @description:
 */
@Data
public class AccountDto {
    private Long id;
    private BigDecimal amount;
    private String name;
}
