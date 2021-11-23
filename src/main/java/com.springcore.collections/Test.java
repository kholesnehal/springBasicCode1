package com.springcore.collections;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
  private static final Logger logger = LogManager.getLogger(Test.class);
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("collectionconfig.xml");
        Emp emp=(Emp) ctx.getBean("emp1");

        logger.info(emp.getName());
        logger.info(emp.getAddresses());
        logger.info(emp.getPhones());
        logger.info(emp.getCourses());

	}

}
