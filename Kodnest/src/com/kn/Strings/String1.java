package com.kn.Strings;

public class String1 {

	public static void main(String[] args) {
		String s1 = ("jdasfj");
		
		System.out.println(s1);
		// CREATED IN HEAP IN STRING POOL WHERE 
	
		String s2 = new String("askdf");
		System.out.println(s2);
	
		char [] crr = {'s','a','f'};
		String s3 = new String (crr);
	
	
	
	/*IF IMMUTABE STRINGS ARE TRIED TO BE CHANGED THEN THE ORIGINAL STRING OBJ WILL NOT BE CHANGED REATHER A 
	NEW STRING OBJ WILL BE CREATEFD IF THE NEW STRING OBJ HAS TO BE REFER
	THEN REFERNCE VAR SHOULF POINT TOT HIS OBJ
	CONACT METHOD IS USED TO PERFOM CINATION OF THIS STRINGS*/
	}
}