package com.ok.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.ok.sbeans")
@ImportResource(value = "com/ok/xml/myFile.xml")
public class AppConfig {

}
