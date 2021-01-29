package com.github.devgcoder.demo;

import com.github.devgcoder.demo.user.entity.User;
import com.github.devgcoder.mybatis.entity.mapper.MybatisEntityMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author duheng
 * @Date 2021/1/29 10:19
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicatioinTest {

	@Autowired
	private MybatisEntityMapper mybatisEntityMapper;

	@Test
	public void insertEntity() {
		User user = new User();
		user.setName("duheng");
		user.setAge(18);
		Integer num = mybatisEntityMapper.insertEntity(user);
		Long id = user.getId();
		System.out.println("num=" + num + ",id=" + id);
	}
}
