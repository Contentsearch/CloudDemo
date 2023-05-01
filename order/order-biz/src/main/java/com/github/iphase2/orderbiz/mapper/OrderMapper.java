package com.github.iphase2.orderbiz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.iphase2.orderbiz.eo.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Title: StorageMapper
 * @Author iPhase2
 * @Date 2023/5/1 12:53
 * @description:
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
