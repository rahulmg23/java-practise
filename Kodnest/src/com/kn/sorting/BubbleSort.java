package com.kn.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the elemensts");
		int n = scan.nextInt();
		
		int [] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		bubblesort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+ " ");
		}
	}

	private static void bubblesort(int[] ar) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ar.length; i++) {            // main logic
			for (int j = 0; j < ar.length-i-1; j++) {
				if (ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j]= ar[j+1];
					ar[j+1] = temp;
				}
				
			}
			
		}
		
	}

}
