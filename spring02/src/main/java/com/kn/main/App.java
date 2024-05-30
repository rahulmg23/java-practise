package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.beans.Laptop;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Laptop l1 = (Laptop) context.getBean("laptop1");
		System.out.println(l1);

		Laptop l2 = (Laptop) context.getBean("laptop2");
		System.out.println(l2);

	}

}
