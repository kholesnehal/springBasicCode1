package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainMain {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("sterotypeconfig.xml");
        Train train=context.getBean("train",Train.class);
        System.out.println(train);
    }
}
