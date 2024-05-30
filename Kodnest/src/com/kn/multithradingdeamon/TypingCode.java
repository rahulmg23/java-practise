package com.kn.multithradingdeamon;

public class TypingCode extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (;;) {
			System.out.println("typing code");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
