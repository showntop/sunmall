package com.wimill.sunmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wimill.sunmall.mapper")
@SpringBootApplication
public class SunmallApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunmallApplication.class, args);
	}
}
