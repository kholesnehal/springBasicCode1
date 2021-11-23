package com.springcore.sterotype;

import com.springcore.collections.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainMain {
    private static final Logger logger = LogManager.getLogger(TrainMain.class);
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("sterotypeconfig.xml");
        Train train=context.getBean("train",Train.class);
        logger.info(train);
    }
}
