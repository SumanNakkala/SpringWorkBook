package com.suman.spring.basics.SpringBasics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
@Named
public class SomeCDIBusiness {
	
	
	/*CDI (Contexts and Dependency Injection) is a standard dependency injection framework included in Java EE 6 and higher.*/
	@Inject
	private CdiclientDao cdiClientDao;

}
