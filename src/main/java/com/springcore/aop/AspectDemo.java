package com.springcore.aop;

import com.springcore.collections.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Aspect
public class AspectDemo {
    private static final Logger logger = LogManager.getLogger(AspectDemo.class);

    @Before("execution(* com.springcore.aop.ShopService.service()")
    public void printBefore()
    {

        logger.info("welcome to shop!");
    }

    @After("execution(* com.springcore.aop.ShopService.service()")
    public void printAfter()
    {
        logger.info("Please visit again!");
    }

}
