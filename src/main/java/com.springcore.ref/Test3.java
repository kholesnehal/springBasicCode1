package com.springcore.ref;

import com.springcore.collections.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	private static final Logger logger = LogManager.getLogger(Test3.class);
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("refconfig.xml");
		A a=(A) ctx.getBean("aref");
		logger.info(a.getX());
		logger.info(a.getObj().getY());
		logger.info(a);
	}

}
