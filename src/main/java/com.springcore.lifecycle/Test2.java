package com.springcore.lifecycle;

import com.springcore.collections.Test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test2 {
    private static final Logger logger = LogManager.getLogger(Test2.class);

	public static void main(String[] args) {

		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("lifecycleconfig.xml");
//        Car car=(Car) ctx.getBean("c1");
//        logger.info(car);
        ctx.registerShutdownHook();
//        
//        Pen pen=(Pen) ctx.getBean("p1");
//        logger.info(pen);
        
        College college=(College) ctx.getBean("clg");
        logger.info(college);
        
	}

}
