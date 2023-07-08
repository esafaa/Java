package practiceAssignmentLoops;

public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) { // iterate i
			for (int j = 1; j <= 12; j++) {
				System.out.print(i * j + "\t"); // print the multiplication of i*j
												// iterate j
			}
			System.out.println();// new row in the multiplication table
		}
	}

}
