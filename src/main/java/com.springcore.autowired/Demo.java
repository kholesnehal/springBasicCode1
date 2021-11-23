package com.springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autoconfig.xml");
		Book book=context.getBean("book",Book.class);
		System.out.println(book);
	}

}
