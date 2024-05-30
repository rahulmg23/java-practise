package com.kn.multithreading2;

public class PrintChar extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 65; i <= 69; i++) {
			System.out.print((char)(i));
		}
	}
}


