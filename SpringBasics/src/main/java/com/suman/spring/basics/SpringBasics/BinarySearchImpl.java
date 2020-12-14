package com.suman.spring.basics.SpringBasics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	
	@Autowired
	@Qualifier("quick")
	public SortAlgorithm sortAlgorithm;
	
	
	
	@PostConstruct
	public void creatingObjects() {
		
		System.out.println("Hello I just created BEANS");
	}
	
	@PreDestroy
	
	public void destroyObjects() {
		
		System.out.println("Hello you objects are about to get destroyed");
	}
	
	
	
	/*
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
	 * 
	 * this.sortAlgorithm = sortAlgorithm;
	 * 
	 * }
	 */
	 


	/*
	 * @Autowired public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * this.sortAlgorithm = sortAlgorithm; }
	 */

	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}



	public int searchForItem(int my_aaray[], int number) {
		
		// Sort the array 
		
		// Bubbble Sort , Quick Sort
		
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		
		// Tightly coupled...!!
		
		//QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
		//quickSortAlgorithm.sort(my_aaray);
		
		// Seaarch the number
		
		// return the found number
		
		System.out.println("My Sorting Implementation type is "+ sortAlgorithm);
		
		sortAlgorithm.sort(my_aaray);
		
		
		
		return 3;
		
		
		
	}

}
