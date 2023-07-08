package gLABHashSetAndTreeSet;

import java.util.TreeSet;

public class TreesetExampleThree {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);

		int first = numbers.first();
		System.out.println("First Number: " + first);

		int last = numbers.last();
		System.out.println("Last Number: " + last);

	}

}
