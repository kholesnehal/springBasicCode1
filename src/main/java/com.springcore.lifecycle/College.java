package com.springcore.lifecycle;

import com.springcore.collections.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class College {
	private static final Logger logger = LogManager.getLogger(Test.class);
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
	
//	@PostConstruct
		public void start()
	{
		logger.info("starting method");
	}
//	@PreDestroy
	public void end()
	{
		logger.info("ending method");
	}

}
