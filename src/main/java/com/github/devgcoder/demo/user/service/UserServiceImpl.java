package com.github.devgcoder.demo.user.service;

import com.github.devgcoder.demo.user.entity.User;
import com.github.devgcoder.mybatis.entity.mapper.MybatisEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author duheng
 * @Date 2021/1/29 10:45
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private MybatisEntityMapper mybatisEntityMapper;

	@Transactional
	@Override
	public Integer addUser(User user) {
		Integer result = mybatisEntityMapper.insertEntity(user);
		return result;
	}

	@Override
	public Integer updateUser(User user) {
		Integer result = mybatisEntityMapper.updateEntity(user);
		return result;
	}
}
