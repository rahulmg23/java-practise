package com.kn.collection;

import java.util.Map;
import java.util.Map.Entry;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, Integer> me = new java.util.HashMap<>();
		
		me.put("one", 1);
		me.put("two", 2);
		me.put("thre", 3);
		me.put("three", 233);
		me.put("threee", 33);

		
//		for(Map.Entry<String, Integer> e : me.entrySet());
//		System.out.println(e.getKey());
		
		for(String key :me.keySet());
		System.out.println(key);
	}

}
