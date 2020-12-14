package com.suman.spring.basics.SpringBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {
	
	
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
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		
		
		/*
		 * 	1. Singleton -  One instance per application context - Default 
		 * 	2. Prototype  - One instance per each rquest.
		 * 
		 * */
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		
				
		 System.out.println("The First Instance of BINARY IMPL "+ binarySearchImpl);
		 
		 System.out.println("The First Instance of SORT IMPL "+ binarySearchImpl.getSortAlgorithm());
		
		 BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
		
		
	     System.out.println("The Second Instance of BINARY IMPL "+ binarySearchImpl1);
	     
	     System.out.println("The Second Instance of BINARY IMPL "+ binarySearchImpl1.getSortAlgorithm());
		
		binarySearchImpl.searchForItem(arr, 3);
		
		
		
	}

}
