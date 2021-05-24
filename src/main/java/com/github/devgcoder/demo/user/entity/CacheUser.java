package com.github.devgcoder.demo.user.entity;

import com.github.devgcoder.mybatis.entity.annos.CacheDelete;
import com.github.devgcoder.mybatis.entity.annos.CacheInsert;
import com.github.devgcoder.mybatis.entity.annos.CacheMapper;
import com.github.devgcoder.mybatis.entity.annos.CacheSelect;
import com.github.devgcoder.mybatis.entity.annos.CacheUpdate;
import java.util.List;
import java.util.Map;

/**
 * @author duheng
 * @Date 2021/5/22 16:58
 */
@CacheMapper
public interface CacheUser {

	@CacheSelect(sql = "select t.* from user t where $[t.name = '@{name}']$ order by id desc")
	void selectUser();

	@CacheInsert(sql = "insert into user(name,age) Values ('@{name}',@{age}),('@{name1}',@{age1})")
	void insertUser();

	@CacheUpdate(sql = "update user set age=@{age} where name = '@{name}'")
	void updateUser();

	@CacheDelete(sql = "delete from user where name = '@{name}'")
	void deleteUser();

	@CacheDelete(sql = "delete from user")
	void deleteAll();

}
