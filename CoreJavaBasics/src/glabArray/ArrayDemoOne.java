package glabArray;

import java.util.Scanner;

public class ArrayDemoOne {

	public static void main(String[] args) {
		int[] age = { 12, 4, 5, 2, 5 };
		// access each array elements
		System.out.println(("Accessing Elements of an Array:"));
		// accessing the element of the array using index number
		System.out.println("First Element: " + age[0]);
		System.out.println("Second Element: " + age[1]);
		System.out.println("Third Element: " + age[2]);
		System.out.println("Fourth Element: " + age[3]);
		System.out.println("Fifth Element: " + age[4]);

// using loops to access all the array elements at once

		System.out.println("Using for Loop:");
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		
		// Iterating Over the array using EnhancedForLoop
		
		for(int element: age) {
			System.out.println(element);
		}
		
		String[] names={ "New York", "Dallas", "Las Vegas", "Florida" };
		for(String name: names) {
			System.out.println(name);
		}
		
		// Compute the sum and Average of Array Elements
		
		int[] numbers= {2, -9,0,5,12,-25,22,9,8,12};
		int sum=0;
		Double average;
		// using for.. each loop to access each array element
		for(int number: numbers) {
			sum+=number;
			}
		//calculate the size of the array
		int arraLength=numbers.length;
		// type casting: converting the int value to a double 
		
		average =(double) sum / arraLength;
		System.out.println("Sum = "+ sum);
		System.out.println("Average = "+ average);
		
		
		//Mean and Standard Deviation
		
		//Declare variable
		int[ ] marks = {74, 43, 58, 60,90,64,70};
		int sum1=0;
		int sumSq=0;
		double mean, stdDev;
		//Compute sum and square-sum using loop
		for (int i =0; i< marks.length; ++i) {
			sum1+=marks[i];
			sumSq+= marks[i]* marks[i];
		}
		mean =(double)sum1/marks.length;
		//Print results
	stdDev=Math.sqrt((double)sumSq/marks.length-mean*mean);
	System.out.printf("Mean is : %.2f%n",mean);
	System.out.printf("Standard deviation is: %.2f%n", stdDev);
	
	//Insert an Element at the end of an Array in Java
	int i, element; // declare variable i will hold the size of the array
	int[] arr = new int[11];
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter 10 Elements: ");
	for(i=0; i<10; i++)
	arr[i] = scan.nextInt(); // insertion of 10 number in the array
	System.out.print("Enter an Element to Insert: ");
	element = scan.nextInt();
	arr[i] = element; //i=11
	System.out.println("\nNow the new array is: ");
	for(i=0; i<11; i++)
	System.out.print(arr[i]+ " "); // printing the numbers

	}
		}
	


