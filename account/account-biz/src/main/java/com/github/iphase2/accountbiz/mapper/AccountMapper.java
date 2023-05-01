package com.github.iphase2.accountbiz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.iphase2.accountbiz.eo.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Title: StorageMapper
 * @Author iPhase2
 * @Date 2023/5/1 12:53
 * @description:
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
