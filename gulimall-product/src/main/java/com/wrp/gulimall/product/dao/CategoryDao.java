package com.wrp.gulimall.product.dao;

import com.wrp.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wrp
 * @email 1345646773@qq.com
 * @date 2024-08-03 11:04:43
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
