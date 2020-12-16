package com.suman.spring.basics.SpringBasics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component - Service is smae as component
public class SomeExternalService {
	
	
	@Value("${some.external.service}")
	public String exteralUrl;
	
	

	public String getExteralUrl() {
		return exteralUrl;
	}
	
	

}
