package com.chewingk.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chewingk.common.utils.PageUtils;
import com.chewingk.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author gary
 * @email garychu97@gmail.com
 * @date 2024-05-27 19:44:29
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

