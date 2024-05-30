package com.kn.Strings;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the alhpabet to check the unicode value");
		char ch = scan.next().charAt(0);
		int unicode = ch;
		System.out.println(unicode);

	/*LEXIGROPHICAL METHOD*/
	scan.close();
	}

}
