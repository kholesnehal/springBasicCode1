package com.springcore.lifecycle;

import org.apache.commons.logging.LogFactory;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

import java.util.logging.Logger;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("lifecycleconfig.xml");
//        Car car=(Car) ctx.getBean("c1");
//        System.out.println(car);
        ctx.registerShutdownHook();
//        
//        Pen pen=(Pen) ctx.getBean("p1");
//        System.out.println(pen);
        
        College college=(College) ctx.getBean("clg");
        System.out.println(college);
        
	}

}
