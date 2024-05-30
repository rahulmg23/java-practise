package com.kn.controlconstruct;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no");
		int num = scan.nextInt();
		switch (num) {
		case 1:System.out.println("1");
		break;
		case 2:System.out.println("2");
		break;
		case 3:System.out.println("3");
		break;
		case 4:System.out.println("4");
		break;
		case 5:System.out.println("5");
		break;
		case 6:System.out.println("6");
		break;
		default : System.out.println(num+"the no is incorrect");
		}
		scan.close();
	}

}
