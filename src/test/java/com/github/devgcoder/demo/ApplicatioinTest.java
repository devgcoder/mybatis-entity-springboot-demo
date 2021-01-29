package com.github.devgcoder.demo;

import com.github.devgcoder.demo.user.entity.User;
import com.github.devgcoder.mybatis.entity.service.MybatisEntityService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
	private MybatisEntityService mybatisEntityService;
	@Test
	public void testEntity() {

		User user = new User();
		user.setName("张三");
		user.setAge(18);
		Integer num = mybatisEntityService.insertEntity(user);
		Long id = user.getId();
		System.out.println("num=" + num + ",id=" + id);
		System.out.println("============");
		List<User> userList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			user = new User();
			user.setName("王五" + i);
			user.setAge(10 + i);
			userList.add(user);
		}
		num = mybatisEntityService.insertEntityList(userList);
		userList.forEach(u -> {
			System.out.println("id=" + u.getId());
		});
		System.out.println("num=" + num);
		System.out.println("============");
		Map<String, Object> whereMap = new HashMap<>();
		whereMap.put("name", "王五1");
		userList = mybatisEntityService.selectEntityList(whereMap, User.class);
		System.out.println();
		user = mybatisEntityService.selectOneEntity(11, User.class);
		System.out.println();
		List<Map<String, Object>> mapList = mybatisEntityService.selectMapList(whereMap, User.class);
		System.out.println();
		Map<String, Object> map = mybatisEntityService.selectOneMap(12, User.class);
		System.out.println();
	}
}
