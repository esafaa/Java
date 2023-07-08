package com.perscholas.java_basics;

import java.util.Scanner;

public class ReadingStringFromConsole {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter three words separated by spaces		
		System.out.println("Enter three words separated by spaces: "); // input : Hello Java Learners

		// Read the next three words entered by the user and store them in s1, s2, and
		// s3; the delimiter is a whitespace either space, tab or newline
		String s1 = input.next(); 
		String s2 = input.next();
		String s3 = input.next();
		// print the value of s1, s2, and
		// s3 to the console
		System.out.println("s1 is " + s1);//Hello
		System.out.println("s2 is " + s2);// Java
		System.out.println("s3 is " + s3);//Learners

		
		/***** second program*/
		input.nextLine();  // to clear scanner buffer for the next read
		
		String s=input.nextLine();
		char ch=s.charAt(0);// 
		System.out.println("The character entered is " + ch); // return the first character in the String s
	}

}
