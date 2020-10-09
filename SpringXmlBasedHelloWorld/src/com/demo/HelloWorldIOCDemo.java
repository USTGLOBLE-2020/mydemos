package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// program for ioc example

public class HelloWorldIOCDemo {

	public static void main(String ar[]) {

		ApplicationContext beanfactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		//bean id here
		HelloBean mybean = (HelloBean) beanfactory.getBean("hello");

		mybean.display();

	}

}
