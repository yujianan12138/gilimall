package com.atguigu.gulimall.sms.dao;

import com.atguigu.gulimall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yjn
 * @email yjn@atguigu.com
 * @date 2019-08-01 20:21:20
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
