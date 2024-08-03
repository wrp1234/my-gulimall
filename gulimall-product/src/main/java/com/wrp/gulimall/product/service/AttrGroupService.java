package com.wrp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wrp.gulimall.common.utils.PageUtils;
import com.wrp.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author wrp
 * @email 1345646773@qq.com
 * @date 2024-08-03 11:04:43
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

