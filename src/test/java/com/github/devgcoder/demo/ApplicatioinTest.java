package com.github.devgcoder.demo;

import com.github.devgcoder.demo.user.entity.User;
import com.github.devgcoder.mybatis.entity.mapper.MybatisEntityMapper;
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
	private MybatisEntityMapper mybatisEntityMapper;
	@Test
	public void testEntity() {
		Map<String, Object> whereMap = new HashMap<>();
		// name为表字段
		whereMap.put("name", "王五2");
		List<Map<String, Object>> list = mybatisEntityMapper.selectMapList(whereMap, User.class);
		list.forEach(map -> {
			System.out.println(map);
		});
	}
}
