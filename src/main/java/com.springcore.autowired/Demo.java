package com.springcore.autowired;

import com.springcore.collections.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	private static final Logger logger = LogManager.getLogger(Test.class);
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autoconfig.xml");
		Book book=context.getBean("book",Book.class);
		logger.info(book);
	}

}
