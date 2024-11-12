package com.spring.spring_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sql")
@Scope("prototype")   //<-- used for creating multiple objects
public class SQLTrainer {
	private String name;
	
	@Autowired
	public SQLTrainer(@Value("Siddhu")String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
