package com.ok.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ok.config.AppConfig;
import com.ok.sbeans.DisplayDatesTime;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		DisplayDatesTime display = ctx.getBean("display",DisplayDatesTime.class);
		String msg = display.getDateAndTime();
		System.out.println(msg);
		
		ctx.close();
	}
}
