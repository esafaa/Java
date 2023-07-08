package gLABLinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListsortExample {

	public static void main(String[] args) {
		// Creation of linked List
		
		LinkedList<String> linkedList= new LinkedList<>();
		linkedList.add("A");
		linkedList.add("C");
		linkedList.add("B");
		linkedList.add("D");
		
		// printing Unsorted list
		System.out.println(linkedList);
		
		// sorting the list
		// using Collections
		Collections.sort(linkedList);
		 //printing list in order
		System.out.println(linkedList);
		
		// Custom sorting
		Collections.sort(linkedList, Collections.reverseOrder());
		
		//printing list in reverse order
		System.out.println(linkedList);

	}

}
