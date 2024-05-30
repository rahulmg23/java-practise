package com.kn.Strings;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the string");
//		String s1 = scan.nextLine();
//		
//		char[] arr = s1.toCharArray();
//		System.out.println("the elements of the array are");
//		for (int i = 0; i < arr.length-1; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		scan.close();
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = scan.nextLine();
		String[] arr = s1.split("a");
		System.out.println("the split contents are");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i] + " ");
		}
		scan.close();
	
	
	
	
	
	
	
	
	
	}

}
