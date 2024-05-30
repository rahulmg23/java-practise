package com.kn.muktithreading3;

public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers t1 = new PrintNumbers();
		t1.start();
	
		PrintCharacter t2 = new PrintCharacter();
			t2.start();
	
	
	}
	}


