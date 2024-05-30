package com.kn.arrays;

public class FindingArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5,6};
		int element = 9;
	
		        int position = findArrayElements(arr, element);

		        if (position != -1) {
		            System.out.println("Element found at position: " + position);
		        } else {
		            System.out.println("Element not found in the array.");
		        }
		    }

		    private static int findArrayElements(int[] arr, int element) {
		        boolean status = false;
		        int position = -1; // Initialize position to -1 (not found)

		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == element) {
		                status = true;
		                position = i + 1; // Position is 1-based
		                break;
		            }
		        }

		        if (status) {
		            return position;
		        } else {
		            return -1; // Element not found
		        }
		    }
		}
