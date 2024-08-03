package com.wrp.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wrp.gulimall.common.utils.PageUtils;
import com.wrp.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wrp
 * @email 1345646773@qq.com
 * @date 2024-08-03 11:50:03
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

