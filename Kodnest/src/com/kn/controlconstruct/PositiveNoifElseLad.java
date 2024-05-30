package com.kn.controlconstruct;

import java.util.Scanner;

public class PositiveNoifElseLad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		if (num%2 == 0) {
			System.out.println("the no is even");
				if (num >= 0) {
					System.out.println("the no is even positive");
					}
					else {
						System.out.println("NO is even negative");
					  }
					}
					else
					{
					if (num>=0)
						{
						System.out.println("the no is odd positive");
						}
						else {
							System.out.println(num+" NO is odd negative");
							}
					scan.close();
					}
				}
			}