package com.kn.patterns;

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int r = 1; r <= 7; r++) {
			for (int c = 1; c <= 7; c++) {
				System.out.print((r == 1 || r == 7 || c == 4) ? "*" : " ");
			}
			System.out.println(" ");
		}
	}

}
