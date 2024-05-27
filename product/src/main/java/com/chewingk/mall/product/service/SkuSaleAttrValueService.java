package com.chewingk.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chewingk.common.utils.PageUtils;
import com.chewingk.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author gary
 * @email garychu97@gmail.com
 * @date 2024-05-27 16:04:55
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

