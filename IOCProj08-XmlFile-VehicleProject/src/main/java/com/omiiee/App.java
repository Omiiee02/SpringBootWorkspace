package com.omiiee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.omiiee.config.AppConfig;
import com.omiiee.sbeans.Vehicle;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Vehicle v = ctx.getBean("vehicle",Vehicle.class);
    	
    	v.startJourney("Pune", "Hyderabad");
    	
    	//close container
    	ctx.close();
    
    }
}
