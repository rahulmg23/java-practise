package com.kn.multithreading2;

public class PrintNum extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			System.out.print(i);
		}
	}
}


