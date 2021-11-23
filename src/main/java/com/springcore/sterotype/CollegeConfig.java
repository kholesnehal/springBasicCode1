package com.springcore.sterotype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {


    @Bean
    public Principal principalBean()
    {
        return new Principal();
    }
//    @Bean
//    public College collageBean()
//    {
////        College college=new College(principalBean());
////        return  college;
//        College college=new College();
//        college.setPrincipal(p);
//    }

}
