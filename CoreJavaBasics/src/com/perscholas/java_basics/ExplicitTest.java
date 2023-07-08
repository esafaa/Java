package com.perscholas.java_basics;

public class ExplicitTest {

	public static void main(String[] args) {
		double d= 100.4;
		long l =(long) d;// explicit type casting
		int i = (int) l;
		System.out.println("Double value "+d);// fractoional part lost  --explicit casting -- double to  long
		System.out.println("Long value "+l); // fractional part lost  --explicit casting -- long to  int
		System.out.println("Int value "+i);
		 
		
		byte b;
		int z=257;
		double dou = 323.142;
		System.out.println("Conversion of int to byte.");
		b =(byte) z; // b =1 remainder of the division of 257 by 256 (range of byte)
		System.out.println("i = "+ z + " b = "+ b);
		System.out.println("Conversion of double to int.");
		
		z=(int) dou; // fractional part is lost
		System.out.println("d = " + dou + " b = " + z);
		System.out.println("Conversion of double to byte.");
	

		b = (byte) dou; //b =67 323%256
		System.out.println("d = " + dou + " b = " + b);
		
		
		

	}

}
