package com.kn.Strings;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "java";
			if (s1==s2) {
				System.out.println("address are the same");
			} else {
				System.out.println("address are not the same");
			}
			if (s1.equals(s2)) {
				System.out.println("the values same");
			} else {
				System.out.println("values not the same");
			}
	}

}
