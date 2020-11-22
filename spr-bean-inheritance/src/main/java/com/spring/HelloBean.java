package com.spring;

public class HelloBean {

	private String message; // dependency variable

	public HelloBean() {
		
	}
	public HelloBean(String message) {
		this.message = message;
	}
	
	public static HelloBean createInstance() {
		System.out.println("Welcome to Spring");
		System.out.println("Some Business code is executing");
		return new HelloBean();
	}

}//dependent class
