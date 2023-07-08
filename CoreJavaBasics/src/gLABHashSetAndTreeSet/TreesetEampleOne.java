package gLABHashSetAndTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetEampleOne {

	public static void main(String[] args) {
	
		
		TreeSet<Integer>  num_Treeset= new TreeSet<>();
		num_Treeset.add(20);
		num_Treeset.add(5);
		num_Treeset.add(15);
		num_Treeset.add(25);
		num_Treeset.add(10);
		
		
		// Using Iterator to print the elements of num_Treeset
		Iterator<Integer> iter_set = num_Treeset.iterator();
		System.out.println("TreeSet using Iterator: ");
		
		while (iter_set.hasNext()) {
			System.out.print(iter_set.next());
			System.out.print(", ");

		}
	}

}
