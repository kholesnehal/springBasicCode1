package com.springcore.sterotype;

import org.springframework.beans.factory.annotation.Value;

public class Client {

    public void test()
    {
        System.out.println("inside client class");
    }

    @Value("Snehal")
    private String name;
    @Value("Pune")
    private String address;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
