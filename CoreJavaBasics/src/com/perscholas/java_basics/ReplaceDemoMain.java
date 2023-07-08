package com.perscholas.java_basics;

public class ReplaceDemoMain {

	public static void main(String[] args) {

		String str1 = "abc cba";
		
		// all occurrences of 'a' is replaced with 'z'
		System.out.println(str1.replace('a', 'c'));// cbc cbc
		
		System.out.println(str1);// 'abc cba' ***remember String are immutable

		// all occurences of 'L' is replaced with 'J'
		System.out.println("Lava".replace('L', 'J'));// Java

		// character not in the string
		System.out.println("Hello".replace('4', 'J'));
		
		// all occurrences of "C++" is replaced with "Java"
	    System.out.println(str1.replace("C++", "Java"));  //abc cba
	    


	    // all occurences of "aa" is replaced with "zz" only "aa" not "a"
	    System.out.println("aa bb a aa  zz".replace("aa", "zz"));//zz bb a zz zz


	 // substring not in the string
	    System.out.println("Java".replace("C++", "C")); //Java
	  }

	}


