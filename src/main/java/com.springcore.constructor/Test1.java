package com.springcore.constructor;

import com.springcore.collections.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {
	private static final Logger logger = LogManager.getLogger(Test1.class);

	public static void main(String[] args) {

		Logger logger = LogManager.getLogger(Test1.class);

		ApplicationContext ctx=new ClassPathXmlApplicationContext("constconfig.xml");
		Person p= (Person) ctx.getBean("person");
		logger.info(p);

	}

}
