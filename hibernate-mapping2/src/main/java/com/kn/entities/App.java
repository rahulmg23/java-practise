package com.kn.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();

		List<Product> list1 = new ArrayList<Product>();
		list1.add(p1);
		list1.add(p2);

		List<Product> list2 = new ArrayList<Product>();
		list2.add(p3);
		list2.add(p4);
		
		Customer c1 = new Customer(1, "amit", 22, list1);
		Customer c2 = new Customer(2, "aamitg", 3222, list2);

		p1.setCost(1000);
		p1.setCustomter(c1);
		p1.setProductId(111);
		p1.setProductName("keyboard");

		p2.setCost(1001);
		p2.setCustomter(c1);
		p2.setProductId(1111);
		p2.setProductName("kkeyboard");

		p3.setCost(10011);
		p3.setCustomter(c2);
		p3.setProductId(11111);
		p2.setProductName("kkkeyboard");

		Configuration conf = new Configuration();
		conf.configure();

		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		session.save(c1);
		session.save(c2);

		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		txn.commit();
		
		System.out.println("---->DONE<");
	}
}
