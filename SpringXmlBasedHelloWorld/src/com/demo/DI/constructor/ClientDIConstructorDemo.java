package com.demo.DI.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// program for using DI using constructor based

public class ClientDIConstructorDemo {

	public static void main(String ar[]) {

		ApplicationContext beanfactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		HelloBeanDIConstructor mybean = (HelloBeanDIConstructor) beanfactory.getBean("HelloBeanDIConstructor");

		mybean.display();

	}

}
