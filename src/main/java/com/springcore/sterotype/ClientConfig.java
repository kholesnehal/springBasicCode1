package com.springcore.sterotype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.springcore.sterotype")

public class ClientConfig {
//    @Bean   //default take method name as id
//@Bean(name = "clientBean")  //single
    @Bean({"clientBean","clBean"}) //creating multiple bean id
public Client clientBean() //clientBean-be id
{
    return new Client();
}
}
