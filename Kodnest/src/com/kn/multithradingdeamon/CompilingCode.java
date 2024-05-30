package com.kn.multithradingdeamon;

public class CompilingCode extends Thread{

	@Override
	public void run() {
		for (; ;) {
			System.out.println("compiling code");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
