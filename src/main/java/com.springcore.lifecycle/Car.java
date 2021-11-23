package com.springcore.lifecycle;

import com.springcore.collections.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Car {
	private static final Logger logger = LogManager.getLogger(Car.class);
	
	private String name;
	private double price;
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
	public void init()
	{
		logger.info("inside init method");
	}
	public void destroy()
	{
		logger.info("inside destroy method");
	}

}
