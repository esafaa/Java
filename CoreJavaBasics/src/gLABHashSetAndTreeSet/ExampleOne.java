package gLABHashSetAndTreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class ExampleOne {

	public static void main(String[] args) {
		HashSet<Integer> evenNumber = new HashSet<>();
		// Using add()method to add element to the set
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("HashSet: " + evenNumber);// print the set of even Numbers
		HashSet<Integer> numbers = new HashSet<>();
// adding the evenNumber to number set using addAll() method
		// doesn't maintain any order(neither insertion or sort order)
		// no duplicate
		numbers.addAll(evenNumber);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(0);
		numbers.add(55);
		numbers.add(17);
		numbers.add(0);

		System.out.println("New HashSet: " + numbers);
	}

}
