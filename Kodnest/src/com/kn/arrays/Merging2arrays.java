package com.kn.arrays;

public class Merging2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int[] brr = {14,23,33,42};
		int[] crr = mergeTwoArrays(arr,brr);
		
		// Traversing the arr
        System.out.println("The arr elements are");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Traversing the brr
        System.out.println("The brr elements are");
        for (int i : brr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Traversing the crr
        System.out.println("The crr elements are");
        for (int i : crr) {
            System.out.print(i + " ");
        }
    }

    private static int[] mergeTwoArrays(int[] arr, int[] brr) {
        int[] crr = new int[arr.length + brr.length];
        for (int i = 0; i < arr.length; i++) {
            crr[i] = arr[i];
        }

        int j = 0;
        for (int i = arr.length; i < crr.length; i++) {
            crr[i] = brr[j];
            j++;
        }

        return crr;
    }
}
