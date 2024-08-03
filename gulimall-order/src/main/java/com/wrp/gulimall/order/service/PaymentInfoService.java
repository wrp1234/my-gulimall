package com.wrp.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wrp.gulimall.common.utils.PageUtils;
import com.wrp.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author wrp
 * @email 1345646773@qq.com
 * @date 2024-08-03 11:48:52
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

