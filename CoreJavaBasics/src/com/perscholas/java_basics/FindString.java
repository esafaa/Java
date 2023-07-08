package com.perscholas.java_basics;

public class FindString {

	public static void main(String[] args) {
		String str1 = "Java is fun";

		int result;
		// getting index of character 's'-- first occurrence
		result = str1.indexOf('s');
		System.out.println(result); // 6

		// getting index of character 'J'--last occurrence
		result = str1.lastIndexOf('J'); // 0
		System.out.println(result);

		// the last occurrence of 'a' is returned
		result = str1.lastIndexOf('a');
		System.out.println(result); // 3

		// character not in the string

		result = str1.indexOf('j');
		System.out.println(result); // -1 because str1 doesn't contain 'j'

		// getting the last occurrence of "ava"

		result = str1.lastIndexOf("ava");
		System.out.println(result); // 1

		// substring not in the string

		result= str1.lastIndexOf("java");
		System.out.println(result); //-1
	}

}
