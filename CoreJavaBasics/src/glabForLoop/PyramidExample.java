package glabForLoop;

public class PyramidExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");// printing on the same line
			}
			System.out.println(); // new Line
		}

	}

}
