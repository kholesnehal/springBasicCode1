package com.springcore.lifecycle;

import com.springcore.collections.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pen implements InitializingBean,DisposableBean {
	private static final Logger logger = LogManager.getLogger(Test.class);
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
		
		logger.info("destroy pen");
		
	}
	public void afterPropertiesSet() throws Exception {
	logger.info("pen after property set");
	}
	
	

}
