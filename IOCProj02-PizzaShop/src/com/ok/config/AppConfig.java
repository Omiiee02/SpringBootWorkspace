package com.ok.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ok.sbeans")
public class AppConfig {

	@Bean(name="createLDT")
	public LocalTime getLocalDateTime(){
		return LocalTime.now();
	}
}
