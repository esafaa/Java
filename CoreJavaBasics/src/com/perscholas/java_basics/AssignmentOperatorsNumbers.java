package com.perscholas.java_basics;

//***@author SAFAA ESS
public class AssignmentOperatorsNumbers {

	public static void main(String[] args) {
		//declare an integer a variable x, assign the value 2 to it,
		
		int x = 2;
		//print out the binary string version of the value of x
		System.out.println(Integer.toBinaryString(x)); // 10
		x = x << 1; // left shift by 1
		System.out.println(Integer.toBinaryString(x));// 100 print the binary value of x
		System.out.println(x);// 4 //print the decimal value of x after lift shift operator
	

		// now we will perform the same steps for different entry y and z
		int y = 17; // left shift by 1
		System.out.println(Integer.toBinaryString(y)); // 10001
		y = y << 1;
		System.out.println(Integer.toBinaryString(y));// 100010
		System.out.println(y);// 34
		

		int z = 88; // left shift by 1
		System.out.println(Integer.toBinaryString(z)); // 1011000
		z = z << 1;
		System.out.println(Integer.toBinaryString(z));// 10110000
		System.out.println(z);// 176
	
		
		
		
	}

}
