package com.ok.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ok.config.AppConfig;
import com.ok.sbeans.PrintCurrentDate;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get the target bean
		Object obj = ctx.getBean("print");
		//type cast to PrintCurrentDAte
		PrintCurrentDate print = (PrintCurrentDate)obj;
		
		System.out.println(print.getDateTime());
		
		//close the container 
		ctx.close();
	}
}
