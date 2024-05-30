package com.kn.multithreading;

public class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	 
		Thread t1 = Thread.currentThread();
		System.out.println(t1);
		}
	}


