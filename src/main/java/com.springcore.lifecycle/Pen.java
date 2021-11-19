package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pen implements InitializingBean,DisposableBean {
	
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Pen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pen [name=" + name + ", price=" + price + "]";
	}
	public Pen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void destroy() throws Exception {
		
		System.out.println("destroy pen");
		
	}
	public void afterPropertiesSet() throws Exception {
	System.out.println("pen after property set");	
	}
	
	

}
