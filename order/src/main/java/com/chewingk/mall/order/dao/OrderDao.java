package com.chewingk.mall.order.dao;

import com.chewingk.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author gary
 * @email garychu97@gmail.com
 * @date 2024-05-27 19:44:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
