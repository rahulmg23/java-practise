package com.kn.strings;

import java.util.Scanner;

public class Stirngeverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the string");
			
			String str = scan.nextLine();
			
			
//			// string builder
//			
//			StringBuilder sbuilder = new StringBuilder(str);
//			System.out.println(sbuilder.reverse());
//			
//			
//			// string buffer
//			StringBuffer  sbuffer = new StringBuffer(str);
//			System.out.println(sbuffer);
//	}
//			
//			char[] ch = str.toCharArray();
//			for (int i = ch.length-1; i >= 0; i--) {
//				System.out.println(ch[i]);
//			}
	
//			for (int i = str.length()-1; i >=0; i--) {
//				System.out.println(str.charAt(i));
//			}
	
	
//			1.toChatArr();
//			char[] ch =str.toCharArray();
//			for (int i = str.length()-1; i >= 0; i--) {
//				System.out.println(str.charAt(i));
//			}
	
			
			
//			2.charArr()
			for (int i = str.length()-1; i >= 0; i--) {
				System.out.println(str.charAt(i));
			}
			
	}
	
	
	
	
}
