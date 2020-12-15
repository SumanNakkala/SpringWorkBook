package com.suman.spring.basics.SpringBasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringBasicsApplication {
	
	static Logger logger = LoggerFactory.getLogger(SpringBasicsApplication.class);
	
	
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
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplication.class);
		//Resource leak: 'applicationContext' is never closed
		//
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		
				
		 System.out.println("The First Instance of BINARY IMPL "+ binarySearchImpl);
		 
		 System.out.println("The First Instance of SORT IMPL "+ binarySearchImpl.getSortAlgorithm());
		
		 BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
		
		
	     System.out.println("The Second Instance of BINARY IMPL "+ binarySearchImpl1);
	     
	     System.out.println("The Second Instance of BINARY IMPL "+ binarySearchImpl1.getSortAlgorithm());
		
		binarySearchImpl.searchForItem(arr, 3);
		
		logger.info("NOW I AM USINF SLF$J LOGGER");
		
		applicationContext.close();
		
		
	}

}
