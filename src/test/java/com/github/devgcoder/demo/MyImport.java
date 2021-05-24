package com.github.devgcoder.demo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author duheng
 * @Date 2021/5/24 15:46
 */
public class MyImport implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata annotationMetadata) {
		return new String[]{"com.github.devgcoder.mybatis.entity.MybatisEntityPlugin"};
	}
}
