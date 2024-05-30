package com.kn.muktithreading3;

public class PrintNumbers extends Thread {


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <=74; i++) {
			System.out.println((char)(69));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	

}
