package com.perscholas.java_basics;

public class AutoPromoteTest {

	public static void main(String[] args) {
	byte b=42;
	char c ='a';
	short s=1024;
	int i = 50000;
	float f =5.67f;
	double d =.1234;
	double result = (f* b)+ (i/c)- (d*s);
	System.out.println("result = "+ result);// result the type double because we promote
											//to the highest data type used in the arithmetic operation
	}
}
