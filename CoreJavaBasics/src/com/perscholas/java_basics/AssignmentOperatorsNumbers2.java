package com.perscholas.java_basics;

public class AssignmentOperatorsNumbers2 {

	public static void main(String[] args) {
		int x =150;
		System.out.println(Integer.toBinaryString(x));//10010110
		x=x>>2;
		System.out.println(Integer.toBinaryString(x));//100101
		System.out.println(x);//37
		
		
		int y =255;
		System.out.println(Integer.toBinaryString(y));//11111111
		y=y>>2;
		System.out.println(Integer.toBinaryString(y));//00111111
		System.out.println(y);//63
		
		
		int z =1555;
		System.out.println(Integer.toBinaryString(z));//11000010011
		z=z>>2;System.out.println(Integer.toBinaryString(z));//110000100
		System.out.println(z);//388
		
		int q =32456;
		System.out.println(Integer.toBinaryString(q));//111111011001000
		q=q>>2;System.out.println(Integer.toBinaryString(q));// 1111110110010
		System.out.println(q);// 8114
		
		

	}

}
