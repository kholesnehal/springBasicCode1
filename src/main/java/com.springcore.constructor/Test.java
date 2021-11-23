package com.springcore.constructor;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
//		Logger logger = LogManager.getLogger(Person.class);
		Logger logger = LogManager.getLogger(Test.class);

		ApplicationContext ctx=new ClassPathXmlApplicationContext("constconfig.xml");
		Person p= (Person) ctx.getBean("person");
		System.out.println(p);
		logger.info("hi");
		logger.error("hey");
	}

}
