package com.omiiee.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.omiiee.config.AppConfig;
import com.omiiee.sbeans.StudentInfo;

public class MainTest {
	
	/*
	 USE OF CUSTOM PROPERTIES FILES AND USE OF @VALUE ANNOTATION  
	 */

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		StudentInfo info = ctx.getBean("student",StudentInfo.class);
		
		System.out.println(info);
		
		ctx.close();
	}
}
