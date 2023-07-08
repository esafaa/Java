package GlabWhileLoop;

import java.util.Scanner;

public class SentinelValuedemo {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
/*
		 */
		int sum = 0;
		int data;
		do {

			System.out.println("Enter an int value (the program exists if the input is 0): ");
			data = input.nextInt();
			sum += data; // add the new entry to the existing sum
		} while (data != 0);// Keep reading data until the input is 0
		System.out.println("The sum is " + sum); //print the after the user exit the loopF
	}
}
