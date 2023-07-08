package com.perscholas.java_basics;

public class Teststringcomparison {

	public static void main(String[] args) {
	String s1="PerScholas";
	
	String s2="PerScholas";
	
	String s3 =new String("PerScholas");
	String s5 =new String("PerScholas");
	String s4="Teksystem";
	System.out.println(s1.equals(s2));//true
	System.out.println(s1==s2); // true
	System.out.println(s1.hashCode()); //-306462934
	System.out.println(s2.hashCode());//-306462934
	System.out.println(s3.hashCode());//-306462934
	System.out.println(s5.hashCode());//-306462934
	System.out.println(s1.equals(s3));//true
	System.out.println(s1==s3);// false
	System.out.println(s3==s5); //false
	System.out.println(s1.equals(s4)); //false
	}

}
