package com.omiiee.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("student")
@Data
@PropertySource(value = "com/omiiee/commons/MyCommons.properties")
public class StudentInfo {
	
	@Value("${stud.name}")
	private String name;
	
	@Value("${stud.add}")
	private String adrs;

}
