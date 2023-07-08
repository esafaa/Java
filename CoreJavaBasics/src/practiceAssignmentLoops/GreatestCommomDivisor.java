package practiceAssignmentLoops;

import java.util.Scanner;

public class GreatestCommomDivisor {

	public static void main(String[] args) {

		int k = 2;
		int result = 1;
		Scanner input = new Scanner(System.in);
		// Prompt user to enter two positive numbers
		System.out.println("Please enter two positive numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		for (k = 2; (k <= num1 && k <= num2); k++) { // check if k is not greater than num1 or num2
			if ((num1 % k == 0) && (num2 % k == 0)) { // check if k is a common divisor for num1 and num2
				result = k; // assign the common divisor to result
			}

		}
		System.out.println(result);// print the greatest common divisor if none than 1 is the only oneF
	}

}
