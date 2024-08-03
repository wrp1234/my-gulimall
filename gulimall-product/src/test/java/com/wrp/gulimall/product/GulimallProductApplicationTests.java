package com.wrp.gulimall.product;

import com.wrp.gulimall.product.entity.BrandEntity;
import com.wrp.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

	@Autowired
	private BrandService brandService;

	@Test
	void contextLoads() {
		List<BrandEntity> list = brandService.list();

		System.out.println(list);

	}

}
