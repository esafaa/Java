package com.perscholas.java_basics;

// @author Safaa Ess
//********PA 303.2.1- Practice Assignment Core Java - Variables******
public class PracticeClass {

	public static void main(String[] args) {
		
		// declares two integer variables, assigns an integer to each
		int numInt1 = 15, numInt2 = 5;
		// adds them together and assign the sum to a variable
		int totalInt = numInt1 + numInt2;
		// Print out the result.
		System.out.println("The sum of " + numInt1 + " and " + numInt2 + " : " + totalInt);

		// declares two double variables, assigns a number to each
		double numDouble1 = 10.2, numDouble2 = 4.6;

		// adds them together and assign the sum to a variable

		double totalDouble = numDouble1 + numDouble2;
		// Print out the result
		System.out.println("The sum of " + numDouble1 + " and " + numDouble2 + " : " + totalDouble);

		totalDouble = numInt1 + numDouble1;
		// the variable should be Double;
		System.out.println("The sum of " + numInt1 + " and " + numDouble2 + " : " + totalDouble);
		
		
		//divides the larger number by the smaller number. Assign the result to a variable.
		totalInt = numInt1 / numInt2;
		// when printing a bigger number by a smaller number of type integer and
		// assigning the result to type integer Java will round to the nearest value
		// but if you assign it to a result of type double we are forcing java to use
		// decimal division instead of integer division
		System.out.println("The result of dividing a bigger number of type integer " + numInt1
				+ " by a smaller number of type integer " + numDouble2 + " : " + totalInt);

		totalDouble = numDouble1 / numDouble2;
		System.out.println("The result of dividing a bigger number of type double " + numInt1
				+ " by a smaller number of type double " + numDouble2 + " : " + (int) totalDouble);

		// declares two integer variables, x and y, and assigns the number 5
		// to x and the number 6 to y.
		int x = 5, y = 6;
		// Declare a variable q and assign y/x to it
		double q = y / x;

		System.out.println("The result of "+y +" ÷ "+x+" : "+ q);
		// cast y to a double and assign it to q. Print q again.

		q = (double) y;
		// Print q again
		System.out.println("New value of q after assigning y to it "+ q);

		// declares a named constant and uses it in a calculation
		final double PI = 3.14159;
		double radiusOfCircle = 3;
		double areaOfCircle = PI * radiusOfCircle * radiusOfCircle;

		System.out.println("Using constant PI " + PI + " to calculate area of circle of radius " + radiusOfCircle
				+ " : " + areaOfCircle);

		// Write a program where you create three variables that represent products at a
		// cafe.
		// Assign prices to each product
		double coffee = 3.99, cappuccino = 5.99, espresso = 5.99, subtotal, totalSale;
		// complete an “order” for three items of the first product, four items of the
		// second
		// product, and two items of the third product.
		subtotal = (3 * coffee) + (4 * cappuccino) + (2 * espresso);
		// Create a constant called SALES_TAX
		final double SALES_TAX = 0.08;
		// add sales tax to the subtotal to
		// obtain the totalSale amount
		totalSale = subtotal * (1 + SALES_TAX);
		System.out.println("Thank you for being our customer");
		System.out.println("Your ordered 3 coffe, 4 cappuccino and 2 espeesso.");
		System.out.println("Your order total is :$ " + (Math.round(totalSale * 100)) / 100.0);

	}

}
