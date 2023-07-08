package gLABHashMapAndTreeMap;

import java.util.HashMap;

public class ExampleOneHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> languages = new HashMap<>();

		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		languages.put(4, "C Sharp");

		System.out.println("HashMap:" + languages);

		// remove element associated with key 2 (will return null if doesn't exist)

		String value = languages.remove(2);
		String value1 = languages.remove(2);
		languages.remove(4, "C Sharp"); // only removes the entry if the key 4 is
										// associated with the value "C Sharp."

		System.out.println("Removed value: " + value);
		System.out.println("Removed value: " + value1);
		System.out.println("Updated HashMap: " + languages);

	}

}
