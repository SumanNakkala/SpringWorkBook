package com.suman.spring.basics.SpringBasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.suman.spring.basics.componenetscan.SpringBasics.ComponentScanDao;
import com.suman.spring.basics.componenetscan.SpringBasics.JdbcScopeCOnnection;

@SpringBootApplication
@ComponentScan("com.suman.spring.basics.componenetscan.SpringBasics")
public class SpringBasicsComponentApplication {
	
	static Logger logger = LoggerFactory.getLogger(SpringBasicsComponentApplication.class);
	
	
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
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBasicsComponentApplication.class, args);
		
		ComponentScanDao componentDao1 = applicationContext.getBean(ComponentScanDao.class);
		
		logger.info("{ }" +  componentDao1);
		
		JdbcScopeCOnnection connection1 = componentDao1.getJdbcConnection();
		
		logger.info("{}" + connection1);
		
		ComponentScanDao componentDao2 = applicationContext.getBean(ComponentScanDao.class);
		
		logger.info("{}" +  componentDao2);
		
		JdbcScopeCOnnection connection2 = componentDao2.getJdbcConnection();
		
		logger.info("{}" +  connection2);
		
		
		
		
		
		
		
		
		/*
		 * 	1. Singleton -  One instance per application context - Default 
		 * 	2. Prototype  - One instance per each rquest.
		 * 
		 * */
		
		
		
		
	}

}
