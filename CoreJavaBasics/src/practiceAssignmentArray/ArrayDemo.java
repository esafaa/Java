/**
 * 
 */
package practiceAssignmentArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author safaa
 *
 */
public class ArrayDemo {

	public static void main(String[] args) {

		/*
		 * Task 1 Write a program that creates an array of integers with a length of 3.
		 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		 */

		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Elements of the array : " + array[i]);
		}

		/*
		 * Task 2 Write a program that returns the middle element in an array. Give the
		 * following values to the integer array: {13, 5, 7, 68, 2} and produce the
		 * following output: 7
		 * 
		 */
		int[] array1 = { 13, 5, 7, 68, 2 };
		int middleElement = (array1.length) / 2;
		System.out.println(" the middle element in the array {13, 5,7,68,2} : " + array1[middleElement]);
		/*
		 * task3 Write a program that creates an array of String type and initializes it
		 * with the strings “red,” “green,” “blue,” and “yellow.” Print out the array
		 * length. Make a copy using the clone( ) method. Use the Arrays.toString( )
		 * method on the new array to verify that the original array was copied.
		 */

		String[] arrayOfString = { "red", "green", "blue", "yellow" };
		System.out.println("the lenght of the array of String : " + arrayOfString.length);

		String[] cloneOfArray = arrayOfString.clone();
		System.out.println("The element of String array : " + Arrays.toString(cloneOfArray));

		/*
		 * Task 4 Write a program that creates an integer array with 5 elements (i.e.,
		 * numbers). The numbers can be any integers. Print out the value at the first
		 * index and the last index using length - 1 as the index. Now try printing the
		 * value at index = length (e.g., myArray[myArray.length] ). Notice the type of
		 * exception which is produced. Now try to assign a value to the array index 5.
		 * You should get the same type of exception.
		 */

		int[] arrayOfint = { 2, 9, 56, 487, 254 };

		System.out.println("Value of first index: " + arrayOfint[0] + " Value of Last index : "
				+ arrayOfint[arrayOfint.length - 1]);

		// System.out.println(
		// "Value of first index: " + arrayOfint[0] + " Value of Last index : " +
		// arrayOfint[5]);
		/*
		 * generate java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for
		 * length 5
		 */

		/*
		 * task5 : Write a program where you create an integer array with a length of 5.
		 * Loop through the array and assign the value of the loop control variable
		 * (e.g., i) to the corresponding index in the array.
		 */
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		/*
		 * Task 6: Write a program where you create an integer array of 5 numbers. Loop
		 * through the array and assign the value of the loop control variable
		 * multiplied by 2 to the corresponding index in the array.
		 */

		int[] arr2 = new int[5];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i * 2;
		}

		/*
		 * Task 7: Write a program where you create an array of 5 elements. Loop through
		 * the array and print the value of each element, except for the middle (index
		 * 2) element.
		 */

		int[] arr3 = new int[] { 2, 15, 28, 36, 201 };
		for (int i = 0; i < arr3.length; i++) {
			if (i != (arr3.length / 2)) {
				System.out.println(arr3[i]);
			}

		}

		/*
		 * Task 8: Write a program that creates a String array of 5 elements and swaps
		 * the first element with the middle element without creating a new array.
		 */
		String[] arrString = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		String swapVar = arrString[0];
		arrString[0] = arrString[arrString.length / 2];
		arrString[2] = swapVar;
		System.out.println(Arrays.toString(arrString));

		/*
		 * Task 9: Write a program to sort the following int array in ascending order:
		 * {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the
		 * smallest and the largest element of the array. The output will look like the
		 * following: Array in ascending order: 0, 1, 2, 4, 9, 13 The smallest number is
		 * 0 The biggest number is 13
		 */

		int[] arrNoneSorted = new int[] { 4, 2, 9, 13, 1, 0 };
		Arrays.sort(arrNoneSorted);
		System.out.println("Array in ascendind order : " + Arrays.toString(arrNoneSorted));
		System.out.println("The smallest number is : " + arrNoneSorted[0]);
		System.out.println("The biggest number is : " + arrNoneSorted[arrNoneSorted.length - 1]);

		/*
		 * Task 10: Create an array that includes an integer, 3 strings, and 1 double.
		 * Print the array.
		 */

		Object[] objectArray = new Object[] { 2, 3, 6, "ABC", "DEF", "GHI", 2003.25 };
		System.out.println(Arrays.toString(objectArray));

		/*
		 * Task 11: Write some Java code that asks the user how many favorite things
		 * they have. Based on their answer, you should create a String array of the
		 * correct size. Then ask the user to enter the things and store them in the
		 * array you created. Finally, print out the contents of the array.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("How many favorite things do you have?");
		int count = input.nextInt();

		String[] list = new String[count];
		input.nextLine();
		for (int i = 0; i < count; i++) {
			System.out.println("Enter your thing");
			list[i] = input.nextLine();
		}
		System.out.println("Your favorite things  are: ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");

		}

	}

	
	
	
}
