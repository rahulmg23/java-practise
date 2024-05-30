package com.kn.patterns;

public class Dalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int r = 1; r < 7; r++) {
			for (int c = 1; c < 7; c++) {
				if ( r==1||c==1||r==6||c ==6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println( );
		}

	}

}
