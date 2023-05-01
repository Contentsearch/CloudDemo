package com.github.iphase2.accountbiz.controller;

import com.github.iphase2.account.api.AccountApi;
import com.github.iphase2.account.dto.AccountDto;
import com.github.iphase2.accountbiz.eo.Account;
import com.github.iphase2.accountbiz.mapper.AccountMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Optional;

/**
 * @Title: AccountController
 * @Author iPhase2
 * @Date 2023/5/1 12:50
 * @description:
 */
@RestController
@RequestMapping("/v1/account")
public class AccountController implements AccountApi {

    @Resource
    private AccountMapper accountMapper;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean addAccount(AccountDto dto) {
        Account account = new Account();
        BeanUtils.copyProperties(dto, account);
        if (dto.getId() != null) {
            accountMapper.updateById(account);
        } else {
            accountMapper.insert(account);
        }
        return Boolean.TRUE;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean updateAccount(AccountDto dto) {
        Account dbAccount = accountMapper.selectById(dto.getId());
        Account account = new Account();
        BeanUtils.copyProperties(dto, account);
        account.setAmount(Optional.ofNullable(dbAccount.getAmount()).orElse(BigDecimal.ZERO).subtract((dto.getAmount())));
        accountMapper.updateById(account);
        return Boolean.TRUE;
    }
}
