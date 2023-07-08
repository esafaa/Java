package gLABArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateAElementsFromArrayListExample {

	public static void main(String[] args) {
		List<String> topCompanies = new ArrayList<>();
		// Check if an ArrayList is empty

		System.out.println("Is the topCompanies list empty? :" + topCompanies.isEmpty());// true

		// Adding elements to the list
		topCompanies.add("Google");
		topCompanies.add("Apple");
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		topCompanies.add("Facebook");

		// Find the size of an ArrayList
		System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
		System.out.println(topCompanies); //5

		
		//Retrieve the element at a given index
		
		String bestCompany= topCompanies.get(0); //Google
		String secondBestCompany = topCompanies.get(1); // Apple
		String lastCompany = topCompanies.get(topCompanies.size() - 1); // Facebook
		
		System.out.println("Best Company: " + bestCompany);
		System.out.println("Second Best Company: " + secondBestCompany);
		System.out.println("Last Company in the list: " + lastCompany);

		topCompanies.set(4,"Walmart ");
		System.out.println("Modified top companies list: " +
				topCompanies);


		
	}

}
