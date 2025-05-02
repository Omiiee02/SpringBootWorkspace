package com.ok.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ok.config.AppConfig;
import com.ok.sbeans.Mobile;

public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Mobile m = ctx.getBean("mobile",Mobile.class);
		
		m.insertSim();
	}
}
