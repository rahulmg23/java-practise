package com.kn.strings;

import java.util.Scanner;

public class Specialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING WITH SPEACIAL CHAT");
		String str = scan.nextLine();
	
		String strs =  str.replaceFirst("[^a-zA-Z0-9]", "");
		System.out.println(strs);
	}

}
