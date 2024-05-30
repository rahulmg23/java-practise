package com.kn.arrays;

import java.util.Scanner;

public class Lift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		double arr[] = new double[1];
		System.out.println("Enter the weight");
		
		for (int i = 0; i < arr.length; i++) {
			double a = scan.nextDouble();
		}
		double totalWeight = 0.0;
		for (int i = 0; i < arr.length; i++) {
			totalWeight = totalWeight + arr[i];
		}
		System.out.println("the wieght is "+totalWeight);
		if (totalWeight <= 5000) {
			System.out.println("not over");
		} else {
			System.out.println("OVERLOADED");
		}
		scan.close();
	}

}
