package com.kn.controlconstruct;

import java.util.Scanner;

public class ElseifLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no");
		int num = scan.nextInt();
		if(num == 1 ) 
			System.out.println("num is 1");
		else if (num==2) 
			System.out.println("num is 2");
		else if (num==3) 
			System.out.println("num is 2");
		else if (num==4) 
			System.out.println("num is 4");
		else if (num==5) 
			System.out.println("num is 5");
		else if (num==6) 
			System.out.println("num is 6");
		else if (num==7) 
			System.out.println("num is 7");
		else 
			System.out.println("the is incorrect");
		scan.close();
	}
}
