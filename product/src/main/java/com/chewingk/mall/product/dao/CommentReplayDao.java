package com.chewingk.mall.product.dao;

import com.chewingk.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author gary
 * @email garychu97@gmail.com
 * @date 2024-05-27 16:04:55
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
