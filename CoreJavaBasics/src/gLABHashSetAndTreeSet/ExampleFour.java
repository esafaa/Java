package gLABHashSetAndTreeSet;

import java.util.HashSet;

public class ExampleFour {

	public static void main(String[] args) {
		HashSet<String> hset= new HashSet<>();
		
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		 // set doesn't allow addition of duplicates
		hset.add("Apple");
		hset.add("Mango");
		
		//Addition of null values
		hset.add(null);
		hset.add(null);

		// printing the elements of set
		
		for(String element:hset) {
			System.out.println("-->"+ element);
		}

		
	}

}
