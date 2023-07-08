package gLABPhoneDrectoryUsingTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectoryWithTreeMap {
	/*
	 * The TreeMap that will store the data. Both Key and value are of type String.
	 * The key represents a name and the value represents the associated phone
	 * number.
	 */

	private TreeMap<String, String> data;

	// Constructor creates an initially empty directory.
	public PhoneDirectoryWithTreeMap() {
		this.data = new TreeMap<String, String>();
	}

	// search for phone number of a giving name
	// return The phone number associated with the name; if the name does not occur
	// in the phone directory, then the return value is null.

	public String getNumber(String name) {
		return this.data.get(name);

	}

	// add new number to the directory if it exists already than update it with the
	// new
	// value
	// The name and number should both be non-null. An IllegalArgumentException is
	// thrown if this is not the case.
	public void putNumber(String name, String number) {
		if (name == null || number == null)
			throw new IllegalArgumentException("name and number cannot be null");
		this.data.put(name, number);
	}

	// Write the contents of the phone directory to System.out.

	public void print() {

		for (Map.Entry<String, String> entry : this.data.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
