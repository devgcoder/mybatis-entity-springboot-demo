package com.github.devgcoder.demo.user.entity;

import com.github.devgcoder.mybatis.entity.annos.TableField;
import com.github.devgcoder.mybatis.entity.annos.TableName;
import java.math.BigInteger;

/**
 * @author duheng
 * @Date 2021/1/29 10:39
 */
@TableName("user")
public class User {

	@TableField(value = "id", isId = true, noneNotInsert = true, useGeneratedKeys = true)
	private Long id;

	@TableField(value = "name")
	private String name;

	@TableField(value = "age")
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
