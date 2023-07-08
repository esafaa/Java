package practiceAssignmentLoops;

public class FutureTuition {

	public static void main(String[] args) {
		double tuition = 10000; // Initialization of tuition variable
		double doubleOfTuion = tuition * 2; // the amount of tuition *2
		int numberOfYears = 0;
		// iteration until tuition is double and each iteration we increment the
		// variable numberOfYears
		while (tuition < doubleOfTuion) {// check if tuition is doubled

			tuition = tuition + (tuition * 0.07); // tuition +7% 
			numberOfYears++; // increment variable numberOfYears
		}
		System.out.println("The tuition will be doubled after " + numberOfYears + " years");// 11 years
	}

}
