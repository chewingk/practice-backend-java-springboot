package com.chewingk.mall.product.dao;

import com.chewingk.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author gary
 * @email garychu97@gmail.com
 * @date 2024-05-27 16:04:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
