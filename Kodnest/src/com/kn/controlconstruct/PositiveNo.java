package com.kn.controlconstruct;

import java.util.Scanner;

public class PositiveNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		if (num>=0) {
			System.out.println("positive no");
		}
		else {
			System.out.println("negative no");
		}
		scan.close();
	}

}
