package com.ok.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("print")
public class PrintCurrentDate {

	@Autowired
	private LocalDate ld;
	
	public String getDateTime() {
		return "Current Date and time is: "+ld;
	}
}
