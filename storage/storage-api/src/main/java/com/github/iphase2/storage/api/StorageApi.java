package com.github.iphase2.storage.api;

import com.github.iphase2.storage.dto.StorageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title: StorageApi
 * @Author iPhase2
 * @Date 2023/4/30 20:42
 * @description:
 */
@FeignClient(name = "storage-service", url = "${storage.service.url:}", path = "/v1/storage")
public interface StorageApi {
    /**
     * 库存扣减
     *
     * @param id
     * @return
     */
    @GetMapping("subtract")
    Boolean subtractStorage(@RequestParam("id") Long id, @RequestParam("amount") String amount);

    @PostMapping("addStorage")
    Boolean addStorage(@RequestBody StorageDto storage);
}
