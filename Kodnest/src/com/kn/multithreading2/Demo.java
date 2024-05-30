package com.kn.multithreading2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNum t1 = new PrintNum();
		t1.start();
		PrintChar t2 = new PrintChar();
		t2.start();
	}

}
