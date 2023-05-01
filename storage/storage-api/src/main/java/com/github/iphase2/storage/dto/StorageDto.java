package com.github.iphase2.storage.dto;

import java.math.BigDecimal;

/**
 * @Title: StorageDto
 * @Author iPhase2
 * @Date 2023/5/1 13:45
 * @description:
 */
public class StorageDto {

    private Long id;
    private String name;
    private String remark;
    private BigDecimal num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }
}
