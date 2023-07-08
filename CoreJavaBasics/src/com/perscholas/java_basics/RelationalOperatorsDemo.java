package com.perscholas.java_basics;

public class RelationalOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10, y = 5;
		System.out.println("x > y : " + (x > y)); // will print true if x is bigger than y else print false
		System.out.println("x < y : " + (x < y)); // will print true if x is bigger than y else print false

		System.out.println("x >= y : " + (x >= y)); // greater than or equal to 10>=5 --true
		System.out.println("x <= y : " + (x <= y));// less than or equal to 10 <=5 --false
		System.out.println("x == y : " + (x == y)); // equal to 10 == 5 --false
		System.out.println("x != y : " + (x != y)); // not equal to  10!=5 -- true
		int variable1 = 50, variable2 = 100, variable3 = 50;
		System.out.println("variable1 = " + variable1); //print value of variable1
		System.out.println("variable2 = " + variable2); //print value of variable2
		System.out.println("variable3 = " + variable3);  //print value of variable3
		System.out.println("variable1 == variable2: " + (variable1 == variable2)); // false not equal
		System.out.println("variable1 == variable3: " + (variable1 == variable3)); // true because there are equal

	}

}
