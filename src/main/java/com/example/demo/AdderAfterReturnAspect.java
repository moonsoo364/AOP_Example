package com.example.demo;

import org.slf4j.LoggerFactory;


public class AdderAfterReturnAspect {
	private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void afterReturn(Object returnValue) throws Throwable{
		logger.info("value return was {}",returnValue);
	}
}
