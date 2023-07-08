package gLABHashMapAndTreeMap;

import java.util.HashMap;

public class ExampletwoHashMap {

	public static void main(String[] args) {
		HashMap<String, String> newHashMap = new HashMap<>();

		// adding key and value to Map
		newHashMap.put("Key1", "Lenovo");
		newHashMap.put("Key2", "Motorola");
		newHashMap.put("Key3", "Nokia");
		newHashMap.put("Key4", null);
		newHashMap.put(null, "Sony");

		// printing the HashMap
		System.out.println("Original map contains:" + newHashMap);

		// getting size of HashMap
		System.out.println("Size of original Map is:" + newHashMap.size());

		HashMap<String, String> copyHashMap = new HashMap<>();

		// copy elements of newhashMap to the copyHashMap
		copyHashMap.putAll(newHashMap);
		System.out.println("copyHashMap mappings= " + copyHashMap);

		// Remove element of key =null
		String nullKeyValue = copyHashMap.remove(null);

		System.out.println("copyHashMap null key value = " + nullKeyValue);
		System.out.println("copyHashMap after removing null key = " + copyHashMap);
		System.out.println("Size of copyHashMap is:" + copyHashMap.size());

	}

}
