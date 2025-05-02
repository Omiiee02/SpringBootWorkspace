package com.omiiee.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.omiiee.sbeans")
@ImportResource(value = "com/omiiee/xml/myXML.xml")
public class AppConfig {

}
