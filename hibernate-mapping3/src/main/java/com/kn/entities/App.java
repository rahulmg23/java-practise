package com.kn.entities;

import java.util.ArrayList;
import java.util.List;

public class App {

	Technology t1 = new Technology();
	Technology t2 = new Technology();
	Technology t3 = new Technology();
	Technology t4 = new Technology();

	List<Technology> technologies1 = new ArrayList<Technology>()
	technologies1.add(t1);
	
	List<Technology> technologies2 = new ArrayList<Technology>();
	List<Technology> technologies3 = new ArrayList<Technology>();
	List<Technology> technologies4 = new ArrayList<Technology>();

	Employee e1 = new Employee(1, "Amit", "B", technologies1);
	Employee e2 = new Employee(2, "Amitt", "C", technologies1);
	Employee e3 = new Employee(3, "Amittt", "D", technologies1);
	Employee e4 = new Employee(4, "Amits", "E", technologies1);
	Employee e5 = new Employee(5, "Amitsdd", "F", technologies1);
	Employee e6 = new Employee(6, "Amitas", "G", technologies1);

}