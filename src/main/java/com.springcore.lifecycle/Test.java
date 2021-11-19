package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
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
