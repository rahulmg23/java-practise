package com.kn.Strings;

public class Comparing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1  = new String("Java");
		System.out.println(s1);
		String s2  = new String("Java");
		System.out.println(s2);
		if(s1==s2) {
			System.out.println("address are the same");
		}
		else {
			System.out.println("address are not the same");
		}
		if(s1.equals(s2)) {
			System.out.println("the values are the same");
		}
		else {
			System.out.println("the values are not the same");
		}
		
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("values are the same after ignoring the cases");
		} else {
			System.out.println("values are the same after not ignoring the cases");
		}
		if (s1.compareTo(s2)>0) {
			System.out.println("s1 is greater then s2");
		} 
		else if (s1.compareTo(s2)>0) {
			System.out.println("s2 is greater then s1");
		} 
		else {
			System.out.println("the values are the same");
		}
	
	}

}
