package com.perscholas.java_basics;

public class AssignmentOperatorsNumber3 {

	public static void main(String[] args) {

		/*
		 * Write a program that declares three int variables: x, y, and z. Assign 7 to x
		 * and 17 to y. Now use the bitwise and operator to derive the decimal and
		 * binary values, and assign the result to z.
		 */

		int x = 7, y = 17, z;

		z = x & y; // 00111
					// 10001
					// ------ & bitwise AND
					// 00001 = 1

		System.out.println("Decimal value of z=x&y : " + z);
		System.out.println("Binary value of z=x&y : " + Integer.toBinaryString(z));

		/* use the bitwise and operator to calculate the “or” value between x and y. */
		z = x | y; // 00111
					// 10001
					// ------ | bitwise OR
					// 10111= 23

		System.out.println("Decimal value of z=x|y : " + z);
		System.out.println("Binary value of z=x|y : " + Integer.toBinaryString(z));

		/*
		 * Write a program that declares an integer variable, assigns a number, and uses
		 * a postfix increment operator to increase the value. Print the value before
		 * and after the increment operator
		 */

		int num = 15;
		System.out.println("value of number before postfix increment : " + num);// 15
		num++;
		System.out.println("value of number after postfix increment : " + num);// 16

		/*
		 * Write a program that demonstrates at least three ways to increment a variable
		 * by 1 and does this multiple times. Assign a value to an integer variable,
		 * print it, increment by 1, print it again, increment by 1, and then print it
		 * again.
		 */

		int num2 = 20;
		System.out.println("value of number before incrementation : " + num2);
		num2++; // using postfix increment
		System.out.println("value of number after first incrementation : " + num2);
		++num2; // using prefix increment
		System.out.println("value of number after second incrementation : " + num2);
		num2 += 1; // using shorthand operator +
		System.out.println("value of number after third  incrementation : " + num2);

	
	}
}
