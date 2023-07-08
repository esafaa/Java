package oppclassExercise;

public class DriverSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount saver1= new SavingsAccount();
		SavingsAccount saver2= new SavingsAccount();
		System.out.println("**Account 1 ");
		saver1.setSavingBalance(2000.0);
		System.out.println("**Account 2");
		saver2.setSavingBalance(3000.0);
		
		System.out.println("***New Interest*****");
		SavingsAccount.annualInterestRate=0.03;
		System.out.println("**Account 1");
		saver1.calculateMonthlyInterest();
		System.out.println("**Account 2");
		saver2.calculateMonthlyInterest();
		System.out.println("***New Interest*****");
		SavingsAccount.annualInterestRate=0.04;
		System.out.println("**Account 1");
		saver1.calculateMonthlyInterest();
		System.out.println("**Account 2");
		saver2.calculateMonthlyInterest();
	}

}
