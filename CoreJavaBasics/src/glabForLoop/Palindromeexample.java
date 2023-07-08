package glabForLoop;

import java.util.Scanner;

public class Palindromeexample {
	/*
	 * A palindrome number, when reversed, represents the same number.
	 */
	public static void main(String[] args) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)// creation of the reversed string

			reverse = reverse + original.charAt(i);
		if (original.equals(reverse)) {// comparing the two string 
			System.out.println("Entered string/number is a palindrome.");
		} else {
			System.out.println("Entered string/number isn't a palindrome.");

		}
	}

}
