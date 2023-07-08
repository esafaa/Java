package gLABHashSetAndTreeSet;

import java.util.HashSet;

public class ExampleThree {

	public static void main(String[] args) {
		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		System.out.println("HashSet1: " + primeNumbers);
		HashSet<Integer> oddNumbers = new HashSet<>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		System.out.println("HashSet2: " + oddNumbers);
		
		
		//  difference between the two sets
		// using removeAll()
		
		primeNumbers.removeAll(oddNumbers); 
		System.out.println("HashSet1: " + primeNumbers);// will return 2

	}

}
