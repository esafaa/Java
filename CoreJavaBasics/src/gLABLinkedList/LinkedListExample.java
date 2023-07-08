package gLABLinkedList;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedlist= new LinkedList<String>();
		//Adding element using add method
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");
		
		//printing the element of the list
		System.out.println("Linked List Content: " +linkedlist);
		
		
		//Add First and Last Element
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("LinkedList Content after addition: " +linkedlist);

		String firstvar=linkedlist.get(0);
		System.out.println("First element: " +firstvar);
		linkedlist.set(0,"changed first item ");
		String firstvar2= linkedlist.get(0);
		System.out.println("First element after update by set method: " +firstvar2);
  //remove first and last element
		
//linkedlist.remove(0);
		linkedlist.removeFirst();
		//linkedlist.remove(linkedlist.size()-1);
		linkedlist.removeLast();
		
	
	System.out.println("LinkedList after deletion of first and last element:" +linkedlist);//[Item5, Item3, Item6]
	
	
	//Add to a Position and remove from a position
	linkedlist.add(0, "Newly added item");// adding to index 0
	linkedlist.remove(2); // removing element at index 0
	System.out.println("Final Content: " +linkedlist);
	}
}


