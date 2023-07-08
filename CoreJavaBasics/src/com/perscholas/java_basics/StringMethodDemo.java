package com.perscholas.java_basics;

import java.util.Calendar;

public class StringMethodDemo {
	public static void main(String[] args) {
		String friday = new String("Today is Friday");
		// find String size:
		int fridayLength = friday.length();// 15
		boolean isFridayEmpty = friday.isEmpty();// false
		// ""
		boolean isFridayBlank = friday.isBlank();// false
		// " "

		String saturday = new String("Today is Saturday");
		boolean friEqSat = friday.equals(saturday);

		String friday2 = "today is friday";
		boolean friEqFri2 = friday.equalsIgnoreCase(friday2);

		int comp = friday.compareTo(friday2);
		String compString = String.valueOf(comp);

		boolean startsWithT = friday.startsWith("T");
		boolean endsWithY = friday.endsWith("Y");

		int indexOfO = friday.indexOf('o');

		int lastIndexOfy = friday.lastIndexOf('y');

		boolean containsAnA = friday.contains("a");

		// Save all the words as an array:

		String[] words = friday.split(" ");
		// print://enhanced for loop to print the
		// word line by line:
		for (String word : words) {
			System.out.println(word);
		}

		// Print the results of everything at the top
		System.out.println(fridayLength); // will print how many characters in the string 'friday' =15.

		System.out.println(isFridayEmpty); // will print false because friday contains 15 characters.

		System.out.println(isFridayBlank); // will print false friday is not blank (contains only whitespace).

		System.out.println(friEqSat); // will print false because the variable friday is not equal to the varibale
										// saturday.

		System.out.println(friEqFri2); // will print true because the method to lowercase() will return the same value
										// as the value of the variable friday--" today is friday"

		System.out.println(comp); // will print negative number because the variable friday is greater than the
									// varibale friday2 (uppercase letters are greater than lowercase)

		System.out.println(compString); // will convert the variable int comp of value -32 to a string "-32"

		System.out.println(startsWithT); // will print 'true' because the variable friday starts with the letter 'T'.

		System.out.println(endsWithY); // will print false because the variable friday end with 'y' not 'Y'

		System.out.println(indexOfO); // will print the index of the first occurrence of the letter 'o' in the
										// variable friday index starts from 0 so the result is --1

		System.out.println(lastIndexOfy); // will print the index of the last occurrence of the letter 'y' in the variable
											// friday 'lenght-1' (because index start with 0 end 'y' is at the end of the variable friday
		
		System.out.println(containsAnA); // will print true because the variable friday contains 'a'

		// And write good comments

		// write code that extracts the F from friday (charAt)
		char charF = friday.charAt(9);
		System.out.println(charF);
		// write code that extracts the substring 'today'
		String today = friday.substring(0, 5);
		System.out.println(today);
		// and saves in a new string called today (substring)

		// convert the string to lowercase and save in another string
		// (toLowerCase)
		String tolowerCase = today.toLowerCase();
		System.out.println(tolowerCase);
		// convert the string to uppercase and save in another string
		// (toUpperCase)
		String toUpperCase = today.toUpperCase();
		System.out.println(toUpperCase);

		// join friday with ". Thank you for being here and save
		// as another string
		// (concat)
		String concat = friday.concat(" Thank you for being here");
		System.out.println(concat);
		// Replace friday with friday2 and save in new
		// string called friday3 (replace)
		String friday3 = friday.toLowerCase().replaceAll("friday", "friday2");
		System.out.println(friday3);
   
       
       // The objects to be used during formatting
       String s = "Per Scholas";
       float n = 74.47f;
       // The result formatted String objects
       String str1 = String.format("My Company name is %s", s), str2 = String.format("My age is %.8f", n);
       // Printing the resultant formatted Strings
       System.out.println(str1 + " " + str2);
}
	
}
