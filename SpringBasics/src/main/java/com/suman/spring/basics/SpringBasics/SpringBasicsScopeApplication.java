package com.suman.spring.basics.SpringBasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.suman.spring.basics.SpringBasics.scopebasics.ComponentDao;
import com.suman.spring.basics.SpringBasics.scopebasics.JdbcCOnnection;

@SpringBootApplication
public class SpringBasicsScopeApplication {
	
	static Logger logger = LoggerFactory.getLogger(SpringBasicsScopeApplication.class);
	
	
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
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBasicsScopeApplication.class, args);
		
		ComponentDao componentDao1 = applicationContext.getBean(ComponentDao.class);
		
		logger.info("{ }" +  componentDao1);
		
		JdbcCOnnection connection1 = componentDao1.getJdbcConnection();
		
		logger.info("{}" + connection1);
		
		ComponentDao componentDao2 = applicationContext.getBean(ComponentDao.class);
		
		logger.info("{}" +  componentDao2);
		
		JdbcCOnnection connection2 = componentDao2.getJdbcConnection();
		
		logger.info("{}" +  connection2);
		
		
		
		
		
		
		
		
		/*
		 * 	1. Singleton -  One instance per application context - Default 
		 * 	2. Prototype  - One instance per each rquest.
		 * 
		 * */
		
		
		
		
	}

}
