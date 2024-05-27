package com.chewingk.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chewingk.common.utils.PageUtils;
import com.chewingk.mall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author gary
 * @email garychu97@gmail.com
 * @date 2024-05-27 16:04:55
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

