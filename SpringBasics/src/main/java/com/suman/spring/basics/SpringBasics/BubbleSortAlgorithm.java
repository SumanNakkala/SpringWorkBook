package com.suman.spring.basics.SpringBasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary

@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	
	
	public void  sort(int array[]) {
		
		System.out.println("USING BUbble Sort ALGO");		
	}

}
