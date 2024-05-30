package com.kn.arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = new int[] {1,2,3,4,5,6};
		
		int [] arr2 = new int[arr1.length];
		
		/*copying arr from 1 to 2*/
		
		for (int i = 0; i < arr1.length; i++) {
		arr2[i]= arr1[i];
		}
		
		System.out.println(" new arr");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		/* printing 1 arr*/
		System.out.println("the orignal arr");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

}
