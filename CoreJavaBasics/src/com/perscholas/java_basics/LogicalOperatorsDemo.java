package com.perscholas.java_basics;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {

		boolean x = true;
		boolean y = false;
		System.out.println("x & y : " + (x & y)); // true and false = false
		System.out.println("x && y : " + (x && y));// true and false = false
		System.out.println("x | y : " + (x | y)); // true or false = true
		System.out.println("x || y: " + (x || y));// true or false = true
		System.out.println("x ^ y : " + (x ^ y)); // XOR will return true because x and y have different values 
		System.out.println("!x : " + (!x)); // not true= false
	}

}
