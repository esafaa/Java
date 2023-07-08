package pacticeControlFlow;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		/*
		 * Write a program that uses if-else-if statements to print out grades A, B, C,
		 * D, F, according to the following criteria: A: 90-100 B: 80-89 C: 70-79 D:
		 * 60-69 F: <60 Use the Scanner class to accept a number score from the user to
		 * determine the letter grade. Print out “Score out of range” if the score is
		 * less than 0 or greater than 100.
		 */
		
		Scanner input= new Scanner(System.in);
		double grade= input.nextDouble();
		
		if (grade<= 100 && grade>= 90) {
			System.out.println("A");
		}else if (grade<= 89 && grade>= 80) {
			System.out.println("B");
		}
		
		else if (grade<= 79 && grade >=70  ) {
			System.out.println("C");
		}
		else if (grade<= 69 && grade >=60  ) {
			System.out.println("D");
		}else if (grade<60  && grade >=0) {
			System.out.println("F");
		}else {
			System.out.println("Score out of range"); 
		}
		input.close();
		int x=0;
		int y;
		if (x==0) {
			y=0;
			System.out.println(y);
		}else if(x>0) {
			y=1;
			System.out.println(y);
		}
		else if(x<0) {
			y=-1;
			System.out.println(y);
		}
		
		
	}

}
