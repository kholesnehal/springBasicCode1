package com.springcore.constructor;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Person {
	Logger logger = LogManager.getLogger(Person.class);


	private String name;
	private int personID;
	private Certificate certi;
	public Person(String name, int personID, Certificate certi) {
		super();
		this.name = name;
		this.personID = personID;
		this.certi = certi;
		System.out.println("hello");
		logger.error("hiee");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personID=" + personID + ", certi=" + certi + "]";
	}
	
	
	
	
	

}
