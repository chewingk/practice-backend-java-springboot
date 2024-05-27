package com.chewingk.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chewingk.common.utils.PageUtils;
import com.chewingk.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author gary
 * @email garychu97@gmail.com
 * @date 2024-05-27 20:04:52
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

