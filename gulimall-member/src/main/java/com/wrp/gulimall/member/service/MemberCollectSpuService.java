package com.wrp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wrp.gulimall.common.utils.PageUtils;
import com.wrp.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author wrp
 * @email 1345646773@qq.com
 * @date 2024-08-03 11:47:43
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

