package com.perscholas.java_basics;

public class LenthDemo {

	public static void main(String[] args) {
			String str1 ="Java";
			String str2="";
			
			// different ways to call the method length on String
			System.out.println(str1.length());//4
			System.out.println(str2.length());//0 empty String
			System.out.println("Java".length());// 4 Charters
			System.out.println("Java\n".length());  //5 -- /n represent a newline character
			System.out.println("learn Java".length());// //10-- space is a character

	}

}
