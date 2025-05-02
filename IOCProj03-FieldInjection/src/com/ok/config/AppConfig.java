package com.ok.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ok.sbeans")
public class AppConfig {

	@Bean(name = "ltime")
	public LocalTime createTime() {
		return LocalTime.now();
	}
	
	@Bean(name = "ldate")
	public LocalDate createDate() {
		return LocalDate.now();
	}
	
	@Bean(name = "ldtime")
	public LocalDateTime createLTime() {
		return LocalDateTime.now();
	}
}
