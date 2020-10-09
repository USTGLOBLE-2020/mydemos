package com.demo.DI.setterbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// program for using DI using constructor based

public class ClientDISetterbasedDemo {

	public static void main(String ar[]) {

		ApplicationContext beanfactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		HelloBeanDISetterBased mybean = (HelloBeanDISetterBased) beanfactory.getBean("HelloBeanDISetter",HelloBeanDISetterBased.class);

		mybean.display();

	}

}
