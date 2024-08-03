package com.wrp.gulimall.order.service.impl;

import com.wrp.gulimall.order.dao.OrderItemDao;
import com.wrp.gulimall.order.entity.OrderItemEntity;
import com.wrp.gulimall.order.service.OrderItemService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wrp.gulimall.common.utils.PageUtils;
import com.wrp.gulimall.common.utils.Query;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements OrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItemEntity> page = this.page(
                new Query<OrderItemEntity>().getPage(params),
                new QueryWrapper<OrderItemEntity>()
        );

        return new PageUtils(page);
    }

}