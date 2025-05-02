package com.omiiee.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.omiiee.sbean")
public class AppConfig {

	@Bean(name ="localDate")
	@Scope("singleton")
	public LocalDate createLd() {
		return LocalDate.now();
	}
}
