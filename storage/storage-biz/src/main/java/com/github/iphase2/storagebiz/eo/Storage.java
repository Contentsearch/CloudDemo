package com.github.iphase2.storagebiz.eo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;

/**
 * @Title: Storage
 * @Author iPhase2
 * @Date 2023/5/1 12:59
 * @description:
 */
@TableName("d_storage")
public class Storage {
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
