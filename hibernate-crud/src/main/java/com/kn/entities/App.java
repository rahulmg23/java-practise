package com.kn.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		create();
	}

	public static void create() {
		// TODO Auto-generated method stub

		Laptop laptop = new Laptop(111, "Dell", 56476);
		Configuration conf = new Configuration().configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(laptop);
		txn.commit();
		System.out.println("laptop has been created" +laptop);

	}

}
