package com.github.devgcoder.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author duheng
 * @Date 2021/1/29 10:19
 */
@MapperScan(basePackages = {"com.github.devgcoder.mybatis.entity.mapper"})
@SpringBootApplication
public class Applicatioin {

	public static void main(String[] args) {
		SpringApplication.run(Applicatioin.class, args);
	}

}
