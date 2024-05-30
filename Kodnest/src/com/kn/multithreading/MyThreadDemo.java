package com.kn.multithreading;

public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2 = Thread.currentThread();
		System.out.println(t2);
	
		MyThread t1 = new MyThread();
	t1.start();
	t1.setName("RAHUL");
	t1.setPriority(1);
	}
}
