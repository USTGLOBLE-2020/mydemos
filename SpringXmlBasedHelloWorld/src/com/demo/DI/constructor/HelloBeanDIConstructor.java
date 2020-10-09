package com.demo.DI.constructor;

public class HelloBeanDIConstructor {
	
	private int id;
	
	
	HelloBeanDIConstructor(){}
	
	
	HelloBeanDIConstructor(int id){
		
		
		this.id = id;
	}
	
	
	
	// bean class
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	void display() {
		
		System.out.println("hi how  u------>"+ id);
		
	}
	

}
