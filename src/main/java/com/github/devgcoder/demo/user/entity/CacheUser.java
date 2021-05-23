package com.github.devgcoder.demo.user.entity;

import com.github.devgcoder.mybatis.entity.annos.CacheMapper;
import com.github.devgcoder.mybatis.entity.annos.CacheSelect;
import java.util.List;
import java.util.Map;

/**
 * @author duheng
 * @Date 2021/5/22 16:58
 */
@CacheMapper
public interface CacheUser {

	@CacheSelect(sql = "select t.* from user t where $[t.name = '@{name}']$ order by id desc")
	void cacheUserOne();

	@CacheSelect(sql = "select t.* from user t where $[t.age = @{age}]$ order by id desc")
	void cacheUserTwo();
}
