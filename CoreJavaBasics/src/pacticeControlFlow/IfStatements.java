package pacticeControlFlow;

public class IfStatements {

	public static void main(String[] args) {

		int x = 7;// declares 1 integer variable x, and then assigns 7 to it
		if (x < 10) { // print out “Less than 10” if x is less than 10
			System.out.println(x + " Less than 10");
		} else if (x > 10 && x<20) {//
			
			System.out.println(x+" Between 10 and 20");// if x is greater than 10 but less than 20
		}else {
			System.out.println(x + " Greater than or equal to 20"); // print out “Greater than or equal to 20” if x x is greater than or equal to 20
		}

	}
}
