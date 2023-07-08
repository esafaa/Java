package com.perscholas.java_basics;

public class AutoTypeConversion {

	public static void main(String[] args) {
		int x = 20;
		double y = 40.5;
		long p = 30;
		float q = 10.60f;
		
		// int z= x+y;// Error; cannot convert from double to int.
		//the result of addition is double because JAVA automatically
		// promoted x to double (y is double higher-ranking)
		// assigning double to int is not allowed because of data loss.
		

		double z = x + y;
		System.out.println("Sum of two numbers: " + z);
		// Long r= p-q; Error; cannot convert from float to long.
		//the result of substraction long and float cannot be long 
		//it's going to be the type float because Java automaticaly promoted p to float
		float r = p - q;//

		System.out.println("Subtraction of two numbers: " + r);

	}

}
