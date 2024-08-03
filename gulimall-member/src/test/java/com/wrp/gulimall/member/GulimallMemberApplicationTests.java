package com.wrp.gulimall.member;

import com.wrp.gulimall.common.feign.coupon.CouponFeign;
import com.wrp.gulimall.common.utils.R;
import com.wrp.gulimall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class GulimallMemberApplicationTests {

	@Autowired
	private MemberService memberService;

	@Autowired
	private CouponFeign couponFeign;


	@Test
	void contextLoads() {
		System.out.println(couponFeign.list(new HashMap<>()));
	}

}
