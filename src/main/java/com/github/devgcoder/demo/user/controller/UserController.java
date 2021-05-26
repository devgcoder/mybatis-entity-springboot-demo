package com.github.devgcoder.demo.user.controller;

import com.github.devgcoder.demo.user.entity.CacheUser;
import com.github.devgcoder.demo.user.entity.User;
import com.github.devgcoder.demo.user.service.UserService;
import com.github.devgcoder.mybatis.entity.service.MybatisEntityService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duheng
 * @Date 2021/1/29 10:39
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private MybatisEntityService mybatisEntityService;

	@RequestMapping(value = "/addUser")
	public Integer addUser(@RequestBody User user) {
    return userService.addUser(user);
	}

	@RequestMapping(value = "/updateUser")
	public Integer updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@RequestMapping(value = "/selectTest")
	public List<Map<String, Object>> selectTest() {
		Map<String, Object> whereMap = new HashMap<>();
		whereMap.put("name", "张三");
		whereMap.put("age", 18);
		List<Map<String, Object>> list1 = mybatisEntityService.selectCacheMapList(whereMap, CacheUser.class, "selectUser");
    System.out.println();
		return list1;
	}
}
