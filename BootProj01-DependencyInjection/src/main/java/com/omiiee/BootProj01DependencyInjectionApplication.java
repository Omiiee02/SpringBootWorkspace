package com.omiiee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.omiiee.sbeans.FindEvenOrOdd;

@SpringBootApplication
public class BootProj01DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);
			
			FindEvenOrOdd find = ctx.getBean("evenOdd",FindEvenOrOdd.class);
			find.findNumberEO(55);
			
			((ConfigurableApplicationContext)ctx).close();
	}

}
