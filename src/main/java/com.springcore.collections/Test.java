package com.springcore.collections;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
  private static final Logger logger = LogManager.getLogger(Test.class);
	public static void main(String[] args) {
//       Logger logger = LogManager.getLogger(Test.class);
//        BasicConfigurator.configure();
        logger.info("welcome");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("collectionconfig.xml");
        Emp emp=(Emp) ctx.getBean("emp1");

        logger.info(emp.getName());
        logger.info(emp.getAddresses());
        logger.info(emp.getPhones());
        logger.info(emp.getCourses());
//        System.out.println(emp.getName());
//        System.out.println(emp.getAddresses());
//        System.out.println(emp.getPhones());
//        System.out.println(emp.getCourses());
        logger.info("hello");
        logger.error("hi");

        logger.debug("hey");
	}

}
