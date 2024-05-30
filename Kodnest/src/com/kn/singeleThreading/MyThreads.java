package com.kn.singeleThreading;

public class MyThreads extends Thread{


	@Override
	public void run() {
		if (Thread.currentThread().getName().equalsIgnoreCase("Numbers")) {
			printNumbers();
		} else {
			printCharacters();
		}
	}

	public void printCharacters() {
		// TODO Auto-generated method stub
		System.out.println("==< printing characters has started");
		for (int i = 65; i <= 75; i++) {
		System.out.println(i+ "");	
		}
		
	}

	public void printNumbers() {
		// TODO Auto-generated method stub
		System.out.println("==< printing Numbers has started");
		for (int i = 0; i <= 10; i++) {
		System.out.println(i+ "");	
		}
	}
	
}
