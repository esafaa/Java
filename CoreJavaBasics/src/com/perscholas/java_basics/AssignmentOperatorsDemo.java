package com.perscholas.java_basics;

public class AssignmentOperatorsDemo {

	public static void main(String[] args) {
		int j, k;
		j = 10; // j gets the value 10.
		j = 5; // j gets the value 5. The previous value is overwritten.
		k = j; // k gets the value 5.
		System.out.println("j is : " + j); // j=5
		System.out.println("k is : " + k); // k=5
		// Multiple Assignments
		k = j = 10; // (k = (j = 10))
		System.out.println("j is : " + j); //j= 10
		System.out.println("k is : " + k);// k=10

	}

}
