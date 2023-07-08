package gLABArrayListUserDefinedObjects;

import java.util.ArrayList;

public class ShowData {

	public static void main(String[] args) {
		// instantiation to class AddDataToArayList
		AddDataToArrayList b = new AddDataToArrayList();
		ArrayList<Book> mybookList = b.bookdetails();

		for (Book showValue : mybookList) {
			System.out.println(showValue.getNumber() + " " + showValue.getName() + " " + showValue.getCategory() + " "
					+ showValue.getAuthor());
		}

	}

}
