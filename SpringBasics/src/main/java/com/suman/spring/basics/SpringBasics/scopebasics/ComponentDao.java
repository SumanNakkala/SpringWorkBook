package com.suman.spring.basics.SpringBasics.scopebasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentDao {
	
	
	@Autowired
	private JdbcCOnnection jdbcConnection;

	public JdbcCOnnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcCOnnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	
	
	
	

}
