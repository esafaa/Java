package com.perscholas.java_basics;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		
		int x, y = 10, z = 5;
		x = y + z; //x =10+5 = 15
		System.out.println("+ operator resulted in " + x);
		x = y - z; // x= 10-5 = 5
		System.out.println("- operator resulted in " + x);
		x = y * z; //x = 10 * 5 =50
		System.out.println("* operator resulted in " + x);
		x = y / z; //x= 10÷ 5 = 2
		
		System.out.println("/ operator resulted in " + x);
		x = y % z; //  remainder 0 --x =0
		System.out.println("% operator resulted in " + x);
		x = y++; // x= y= 10, then y is incremented by 1 so now y= 11
		
		System.out.println("Postfix ++ operator resulted in " + x);
		x = ++z; //x=z+1 -- x=6 and z = 6
		System.out.println("Prefix ++ operator resulted in " + x);
		
		x = -y; //x=-11
		System.out.println("Unary operator resulted in " + x);
		// Some examples of special Cases
		int tooBig = Integer.MAX_VALUE + 1; // -2147483648 which is
		// Integer.MIN_VALUE.
		int tooSmall = Integer.MIN_VALUE - 1; // 2147483647 which is
		// Integer.MAX_VALUE.
		System.out.println("tooBig becomes " + tooBig);
		System.out.println("tooSmall becomes " + tooSmall);
		System.out.println(4.0 / 0.0); // Prints: Infinity
		System.out.println(-4.0 / 0.0); // Prints: -Infinity
		System.out.println(0.0 / 0.0); // Prints: NaN
		double d1 = 12 / 8; // result: 1 by integer division. d1 gets the
		//value
		// 1.0.
		double d2 = 12.0F / 8; // result: 1.5
		System.out.println("d1 is " + d1);
		System.out.println("d2 iss " + d2);
		


	}

}
