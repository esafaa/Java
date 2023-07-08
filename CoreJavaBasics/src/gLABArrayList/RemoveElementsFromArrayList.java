package gLABArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {

	public static void main(String[] args) {
		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("Python");
		programmingLanguages.add("Perl");
		programmingLanguages.add("Ruby");
		System.out.println("Initial List: " + programmingLanguages);

		// Remove the element at index'5'
		programmingLanguages.remove(5);

		System.out.println("After remove(5): " + programmingLanguages);

		boolean isRemoved = programmingLanguages.remove("Kotlin");
		System.out.println("After remove(\"Kotlin\"): " +programmingLanguages);
		
		//remove all the elements that exist in a given collection
		
		List<String> scriptingLanguages = new ArrayList<>();
		scriptingLanguages.add("Python");
		scriptingLanguages.add("Ruby");
		scriptingLanguages.add("Perl");
		
		programmingLanguages.removeAll(scriptingLanguages);
		System.out.println("After rmoveAll(scriptingLanguages): "+ programmingLanguages);
		
		// Remove All elements from the ArrayList
		programmingLanguages.clear();
		System.out.println("After clear(): " + programmingLanguages);
		
		System.out.println("Checking if the list isempty after calling clear method "+ programmingLanguages.isEmpty());
		
		
		
	}

}
