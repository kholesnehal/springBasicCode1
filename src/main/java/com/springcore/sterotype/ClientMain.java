package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientMain {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ClientConfig.class);
        Client client=context.getBean("clBean",Client.class);
        System.out.println(client);
        client.test();

    }
}
