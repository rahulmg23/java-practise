package com.insertObjects;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1=new Student(1,"ata","cds");
			Student s2=new Student(2,"aa","ds");
			
			Dbapp.insertObject(s1);
			Dbapp.insertObject(s2);

	}

}
