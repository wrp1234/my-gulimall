package com.wrp.gulimall.common.feign.coupon;

import com.wrp.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author wrp
 * @date 2024年08月03日 14:17
 * @description
 */
@FeignClient(path = "coupon/coupon", value = "gulimall-coupon",
        contextId = "couponFeign",
        fallbackFactory = CouponFeignFallbackFactory.class)
public interface CouponFeign {

    @RequestMapping("/list")
    R list(@RequestParam Map<String, Object> params);

    @RequestMapping("/info/{id}")
    R info(@PathVariable("id") Long id);
}
