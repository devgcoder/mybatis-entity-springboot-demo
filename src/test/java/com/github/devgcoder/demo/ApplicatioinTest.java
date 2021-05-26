package com.github.devgcoder.demo;

import com.github.devgcoder.demo.user.entity.CacheUser;
import com.github.devgcoder.mybatis.entity.service.MybatisEntityService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author duheng
 * @Date 2021/1/29 10:19
 */

@Import(MyImportSelector.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicatioinTest {
	@Autowired
	private MybatisEntityService mybatisEntityService;

	@Test
	public void testEntity() {

//		User user = new User();
//		user.setName("张三");
//		user.setAge(18);
//		Integer num = mybatisEntityService.insertEntity(user);
//		Long id = user.getId();
//		System.out.println("num=" + num + ",id=" + id);
//		System.out.println("============");
//		List<User> userList = new ArrayList<>();
//		for (int i = 0; i < 5; i++) {
//			user = new User();
//			user.setName("王五" + i);
//			user.setAge(10 + i);
//			userList.add(user);
//		}
//		num = mybatisEntityService.insertEntityList(userList);
//		userList.forEach(u -> {
//			System.out.println("id=" + u.getId());
//		});
//		System.out.println("num=" + num);
//		System.out.println("============");
//		Map<String, Object> whereMap = new HashMap<>();
//		whereMap.put("name", "王五1");
//		userList = mybatisEntityService.selectEntityList(whereMap, User.class);
//		System.out.println();
//		user = mybatisEntityService.selectOneEntity(11, User.class);
//		System.out.println();
//		List<Map<String, Object>> mapList = mybatisEntityService.selectMapList(whereMap, User.class);
//		System.out.println();
//		Map<String, Object> map = mybatisEntityService.selectOneMap(12, User.class);
//		System.out.println();

//		Map<String, Class> handlerMap = new HashMap<String, Class>();
//
//		//spring工具类，可以获取指定路径下的全部类
//		ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
//		try {
//			String pattern = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX +
//					ClassUtils.convertClassNameToResourcePath(BASE_PACKAGE) + RESOURCE_PATTERN;
//			Resource[] resources = resourcePatternResolver.getResources(pattern);
//			//MetadataReader 的工厂类
//			MetadataReaderFactory readerfactory = new CachingMetadataReaderFactory(resourcePatternResolver);
//			for (Resource resource : resources) {
//				//用于读取类信息
//				MetadataReader reader = readerfactory.getMetadataReader(resource);
//				//扫描到的class
//				String classname = reader.getClassMetadata().getClassName();
//				Class<?> clazz = Class.forName(classname);
//				//判断是否有指定主解
//				CacheMapper anno = clazz.getAnnotation(CacheMapper.class);
//				if (anno != null) {
//					//将注解中的类型值作为key，对应的类作为 value
//					handlerMap.put(classname, clazz);
//				}
//			}
//		} catch (IOException | ClassNotFoundException e) {
//		}
		Map cacheMap = new HashMap();
		Integer num = mybatisEntityService.deleteCacheMap(cacheMap, CacheUser.class, "deleteAll");

		cacheMap = new HashMap();
		cacheMap.put("name", "张三");
		cacheMap.put("age", 18);
		cacheMap.put("name1", "李四");
		cacheMap.put("age1", 20);
		num = mybatisEntityService.insertCacheMap(cacheMap, CacheUser.class, "insertUser");

		cacheMap = new HashMap();
		cacheMap.put("name", "张三");
		cacheMap.put("age", 20);
		num = mybatisEntityService.updateCacheMap(cacheMap, CacheUser.class, "updateUser");

		cacheMap = new HashMap();
		cacheMap.put("name", "李四");
		num = mybatisEntityService.deleteCacheMap(cacheMap, CacheUser.class, "deleteUser");


		List<Map<String, Object>> cacheMapList = mybatisEntityService.selectCacheMapList(cacheMap, CacheUser.class, "selectUser");
		System.out.println();

	}
}
