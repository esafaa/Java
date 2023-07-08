package com.perscholas.java_basics;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String vowels = "a::b::c::d::e";

		// call the method split() on the String vowels with delimiter "::" it
		// will returns an array of String 'result that contains the substring [a, b, c,
		// d, e]
		String[] result = vowels.split("::");

		System.out.println("result =" + Arrays.toString(result));//result =[a, b, c, d, e]

	}

}
