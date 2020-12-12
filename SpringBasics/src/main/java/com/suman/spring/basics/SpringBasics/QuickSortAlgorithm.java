package com.suman.spring.basics.SpringBasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	
	
	
	public void  sort(int array[]) {
		
		System.out.println("USING QUICK SORT ALGO");		
	}

}
