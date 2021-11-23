package com.springcore.aop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainShop {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("aopconfig.xml");
            ShopService shopService=context.getBean("shop",ShopService.class);
            shopService.service();
    }
}
