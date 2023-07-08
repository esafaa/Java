package com.perscholas.java_basics;

public class Teststringcomparison3 {

	public static void main(String[] args) {

		String s1 = "Perscholas";
		String s2 = "Perscholas";
		String s3 = "Perscholas";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 0
		System.out.println(s3.compareTo(s1));// 0
		/*
		 * s1 == s2 : The method returns 0. s1 > s2 : The method returns a positive
		 * value. s1 < s2 : The method returns a negative value.
		 */

	}

}
