package com.xhw.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.xhw.springbootmybatis.mapper")
public class SpringbootMybatisDruidDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisDruidDemoApplication.class, args);
	}

}
