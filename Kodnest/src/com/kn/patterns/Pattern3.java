package com.kn.patterns;



public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n = 0;
	 
		for (int i = 0; i < 2 * n; i++) {
            int k = i > n ? 2 * n - i: i;
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
	    }
	}
}

