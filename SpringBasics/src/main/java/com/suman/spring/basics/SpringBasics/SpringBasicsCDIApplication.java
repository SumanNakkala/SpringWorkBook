package com.suman.spring.basics.SpringBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.suman.spring.basics.SpringBasics.cdi.SomeCDIBusiness;

@SpringBootApplication
public class SpringBasicsCDIApplication {
	
	
	/**
	 * 
	 * What are the beans Spring should manage 
	 * 
	 * Where are the beans 
	 * 
	 * What are the dependencies
	 * 
	 * */

	public static void main(String[] args) {
		
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBasicsCDIApplication.class, args);
		
		
		/*
		 * 	1. Singleton -  One instance per application context - Default 
		 * 	2. Prototype  - One instance per each rquest.
		 * 
		 * */
		
		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
		
				System.out.println("THE CDI objetct is " + business);
	
		
	}

}
