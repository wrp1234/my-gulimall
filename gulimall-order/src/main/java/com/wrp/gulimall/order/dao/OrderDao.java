package com.wrp.gulimall.order.dao;

import com.wrp.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wrp
 * @email 1345646773@qq.com
 * @date 2024-08-03 11:48:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
