package com.perscholas.java_basics;

public class AssignmentOperatorsNumbers5 {

	public static void main(String[] args) {
		/*
		 * Write a program that declares two integer variables: x, and y, and then
		 * assigns 5 to x and 8 to y. Create another variable sum and assign the value
		 * of ++x added to y, and print the result. Notice the value of the sum (should
		 * be 14). Now change the increment operator to postfix (x++) and re-run the
		 * program. Notice what the value of the sum is. The first configuration
		 * incremented x, and then calculated the sum, while the second configuration
		 * calculated the sum, and then incremented x.
		 */

		int x, y, sum;
		x = 5;
		y = 8;
		sum = x++ + y;
		System.out.println(sum);// 13;

	}

}
