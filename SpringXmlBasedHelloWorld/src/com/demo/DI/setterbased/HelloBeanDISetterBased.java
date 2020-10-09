package com.demo.DI.setterbased;

public class HelloBeanDISetterBased {

	private int id;

	// bean class
	private String name;

	public String getName() {
		return name;
	}

  // chakradhar will set here
	public void setName(String name) {
		this.name = name;
	}

	void display() {

		System.out.println("by setter based" + name);

	}

}
