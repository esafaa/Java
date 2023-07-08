package oppclassExercise;

public class SavingsAccount {

 public static double annualInterestRate;
private double savingBalance;


public double getSavingBalance() {
	return savingBalance;
}


public void setSavingBalance(double savingBalance) {
	this.savingBalance = savingBalance;
}


public void calculateMonthlyInterest() {
	double monthlyInterest= Math.round(((savingBalance*annualInterestRate)/12)*100)/100.0;
	savingBalance+=monthlyInterest;
	System.out.println("The monthly interest for the account is : $"+monthlyInterest+"\n New Balance : $"+ savingBalance);
}


public static void modifyInterestRate(double newAnnualInterestRate) {
	annualInterestRate=newAnnualInterestRate;
	
}
}
