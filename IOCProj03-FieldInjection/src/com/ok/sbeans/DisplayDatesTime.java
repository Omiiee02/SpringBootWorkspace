package com.ok.sbeans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("display")
public class DisplayDatesTime {

	@Autowired(required = true)
	private LocalDate ldate;
	@Autowired(required = true)
	private LocalTime ltime;
	@Autowired(required = true)
	private LocalDateTime lddate;
	
	
	public String getDateAndTime() {
		return ldate+" | "+ltime+" | "+lddate;
	}

}
