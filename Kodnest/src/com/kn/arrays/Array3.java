package com.kn.arrays;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = new String[4];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the names");
 
		for (int i = 0; i < arr.length; i++) {
			   arr[i] = scan.next();
		}
		System.out.println("THE NAMES OF THE EMPLOYEES ARE :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
	scan.close();
	}

}
