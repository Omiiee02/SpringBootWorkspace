package com.ok.config;

import java.time.LocalTime;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ok.sbeans")
public class AppConfig {

	@Bean(name="randomNO")
	public int createRandom() {
		Random r = new Random();
		int no = r.nextInt(1000);
		return no;
	}
	
	@Bean(name = "ltime")
	public LocalTime createLocalTime() {
		return LocalTime.now();
	}
}
