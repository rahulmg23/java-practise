package com.kn.arrays;

import java.util.Scanner;

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		int arr[] = new int[2];
		System.out.println("enter the no to be stored");
	
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
	
		System.out.println("enter hte nos to be checked");
		int num  = scan.nextInt();
		boolean status = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]== num  ) {
				status = true;
				break;
			}	
		}
		if (status == true) {
			System.out.println("the first was true");
		} else {
			System.out.println("the 2 was true");
		}
	}

}
