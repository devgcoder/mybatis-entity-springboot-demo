package com.github.devgcoder.demo.user.controller;

import com.github.devgcoder.demo.user.entity.User;
import com.github.devgcoder.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping(value = "/addUser")
	public Long addUser(@RequestBody User user) {
    return userService.addUser(user);
	}

}
