package com.github.devgcoder.demo.user.service;

import com.github.devgcoder.demo.user.entity.User;

/**
 * @author duheng
 * @Date 2021/1/29 10:45
 */
public interface UserService {

	public Integer addUser(User user);

	public Integer updateUser(User user);
}
