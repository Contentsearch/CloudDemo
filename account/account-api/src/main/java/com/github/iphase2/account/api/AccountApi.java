package com.github.iphase2.account.api;

import com.github.iphase2.account.dto.AccountDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Title: AccountApi
 * @Author iPhase2
 * @Date 2023/4/30 20:45
 * @description:
 */
@FeignClient(name = "account-service", url = "${account.service.url:}", path = "/v1/account")
public interface AccountApi {

    @PostMapping("add")
    Boolean addAccount(@RequestBody AccountDto dto);

    @PostMapping("updateAccount")
    Boolean updateAccount(@RequestBody AccountDto dto);
}
