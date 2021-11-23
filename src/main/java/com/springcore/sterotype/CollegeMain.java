package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeMain {

    ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
    College college=context.getBean("collegeBean",College.class);
//        college.demo();

}
