package pacticeControlFlow;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		/*
		 * . Create a program that lets the users input their filing status and income.
		 * Display how much tax the user would have to pay according to status and
		 * income. The U.S. federal personal income tax is calculated based on the
		 * filing status and taxable income. There are four filing statuses: Single,
		 * Married Filing Jointly, Married Filing Separately, and Head of Household. The
		 * tax rates for 2009 are shown below.
		 */
		final double tax10=0.01, tax15=0.15, tax25=0.25 , tax28=0.28, tax33=0.33,tax35=0.35;
		double income,taxForIncome=0;
		int martailStatus;
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Please enter your filing status : \n \t"
				+ "1: Single \n \t"
				+ "2: Married filing Jointly or Qualifying widow(er) \n \t"
				+ "3: Married Filing Separately \n \t"
				+ "4: Head of Household \n \t");
		       martailStatus= input.nextInt();
		       if (martailStatus<=0|| martailStatus>=6 ){
		    	   System.out.println("Invalid entry");
		      
		       } else {
		       System.out.println("Please provide your Income : ");
				income= input.nextDouble();
				switch(martailStatus) {
				case 1: if (income >0 && income<8350) {
					taxForIncome=income*tax10;
				}else if (income >8351 && income<33950) {
					taxForIncome=income*tax15;
				}else if (income >33951 && income<82250) {
					taxForIncome=income*tax25;
				}else if (income >82251 && income<171550) {
					taxForIncome=income*tax28;
				}else if (income >171551 && income<372950) {
					taxForIncome=income*tax33;
				}else if (income >372951) {
					taxForIncome=income*tax35;
				}else {
					taxForIncome=0;
				}break;
				case 2: if (income >0 && income<16700) {
					taxForIncome=income*tax10;
				}else if (income >16701 && income<67900) {
					taxForIncome=income*tax15;
				}else if (income >67901 && income<137050) {
					taxForIncome=income*tax25;
				}else if (income >137051 && income<208850) {
					taxForIncome=income*tax28;
				}else if (income >208851 && income<372950) {
					taxForIncome=income*tax33;
				}else if (income >372951) {
					taxForIncome=income*tax35;
				}else {
					taxForIncome=0;
				}break;
				case 3: if (income >0 && income<8350) {
					taxForIncome=income*tax10;
				}else if (income >8351 && income<33950) {
					taxForIncome=income*tax15;
				}else if (income >33951 && income<68525) {
					taxForIncome=income*tax25;
				}else if (income >68526 && income<104425) {
					taxForIncome=income*tax28;
				}else if (income >104426 && income<186475) {
					taxForIncome=income*tax33;
				}else if (income >186476) {
					taxForIncome=income*tax35;
				}else {
					taxForIncome=0;
				}break;
				case 4: if (income >0 && income<11950) {
					taxForIncome=income*tax10;
				}else if (income >11951 && income<45500) {
					taxForIncome=income*tax15;
				}else if (income >45501 && income<117450) {
					taxForIncome=income*tax25;
				}else if (income >117451 && income<190200) {
					taxForIncome=income*tax28;
				}else if (income >190201 && income<372950) {
					taxForIncome=income*tax33;
				}else if (income >372951) {
					taxForIncome=income*tax35;
				}else {
					taxForIncome=0;
				}break;
				
		
				      
				}
				
System.out.println("According to your filing status and income  you would have to pay : $"+ Math.round(taxForIncome*100)/100.0);
	}}
}
