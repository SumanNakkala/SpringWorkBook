package com.suman.spring.basics.SpringBasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.suman.spring.basics.SpringBasics.properties.SomeExternalService;

//@SpringBootApplication
@Configuration
@ComponentScan
@PropertySource("app.properties")
//@PropertySources
public class SpringBasicspropertiesApplication {
	
	static Logger logger = LoggerFactory.getLogger(SpringBasicspropertiesApplication.class);
	
	
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
		
		int[] arr = {4,8,9,10};
		//SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		
		SortAlgorithm quickSort = new QuickSortAlgorithm();
		
		//BinarySearchImpl binarySearchImpl = new BinarySearchImpl(quickSort);
		//binarySearchImpl.searchForItem(arr, 9);
		
		//ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		
		
		/*
		 * 	1. Singleton -  One instance per application context - Default 
		 * 	2. Prototype  - One instance per each rquest.
		 * 
		 * */
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicspropertiesApplication.class);
		//Resource leak: 'applicationContext' is never closed
		//
		
		SomeExternalService externalService = applicationContext.getBean(SomeExternalService.class);
		
		logger.info("The object is " + externalService);
		
		logger.info("The external service endpoint is " + externalService.getExteralUrl());
		
				
		
		
		applicationContext.close();
		
		
	}

}
