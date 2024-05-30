package com.demoV;


public class Prime {

	public static void main(String[] args) {
		int num;
		boolean isPrime = true;
		num = Integer.parseInt(args[0]);
		for (int i = 3; i <= Math.sqrt(num) ; i++) {
			if((num % i) == 0) {
				isPrime = false;
					break;
			}
		}
if(isPrime) {
	System.out.println("Prime");
}
else System.out.println("not prime");
}
}

	
