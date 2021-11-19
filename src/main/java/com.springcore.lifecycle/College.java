package com.springcore.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class College {
	private String collegeName;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + "]";
	}
	
	@PostConstruct 
		public void start()
	{
		System.out.println("starting method");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("ending method");
	}

}
