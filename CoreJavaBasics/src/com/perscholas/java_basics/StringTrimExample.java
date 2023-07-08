package com.perscholas.java_basics;

public class StringTrimExample {

	public static void main(String[] args) {
		String s1 = "  hello  ";
		System.out.println(s1 + "how are you");// Concatenate String 's1' with "How are you"
		System.out.println(s1.trim() + "how are you"); // remove the spaces from beginning and end of str1 than
														// concatenate with "how are you"

	}

}
