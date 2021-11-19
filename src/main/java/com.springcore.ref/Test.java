package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a=(A) ctx.getBean("aref");
		System.out.println(a.getX());
		System.out.println(a.getObj().getY());
		System.out.println(a);
	}

}
