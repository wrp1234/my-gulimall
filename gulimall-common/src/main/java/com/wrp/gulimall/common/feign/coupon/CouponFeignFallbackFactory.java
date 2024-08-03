package com.wrp.gulimall.common.feign.coupon;

import com.wrp.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FallbackFactory;

import java.util.Map;

/**
 * @author wrp
 * @date 2024年08月03日 14:18
 * @description
 */
public class CouponFeignFallbackFactory implements FallbackFactory<CouponFeign> {
    @Override
    public CouponFeign create(Throwable cause) {
        return new CouponFeign() {
            @Override
            public R list(Map<String, Object> params) {
                return R.error("服务不可用");
            }

            @Override
            public R info(Long id) {
                return R.error("服务不可用");
            }
        };
    }
}
