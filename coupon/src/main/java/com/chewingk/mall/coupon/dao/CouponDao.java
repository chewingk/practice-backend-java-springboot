package com.chewingk.mall.coupon.dao;

import com.chewingk.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author gary
 * @email garychu97@gmail.com
 * @date 2024-05-27 19:57:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
