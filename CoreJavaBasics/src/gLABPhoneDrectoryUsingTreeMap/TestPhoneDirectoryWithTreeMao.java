package gLABPhoneDrectoryUsingTreeMap;

public class TestPhoneDirectoryWithTreeMao {

	public static void main(String[] args) {
		PhoneDirectoryWithTreeMap directory = new PhoneDirectoryWithTreeMap();
		System.out.println("adds several entries. It then prints the contents of");
		System.out.println("directory and does a few lookups.");
		System.out.println();
		directory.putNumber("Fred","555-1234");
		directory.putNumber("Barney","555-2345");
		directory.putNumber("Wilma","555-3456");
		directory.putNumber("Wilma","555-3456"); // will update Wilma phone number
		directory.putNumber("Wilma","555-2563");// last update of Wilma phone
		
		
		//directory.putNumber(null,"555-2563");  exception IllegalArgumentException
		
		//directory.putNumber("null", null); exception IllegalArgumentException
		System.out.println("Contents are:");
		System.out.println();
		directory.print();
		System.out.println();
		System.out.println("Number for Fred is " + directory.getNumber("Fred"));
		System.out.println("Number for Wilma is " +
		directory.getNumber("Wilma"));
		System.out.println("Number for Tom is " + directory.getNumber("Tom")); //null
		System.out.println("Number for Alex is " + directory.getNumber("Alex"));// null

	}

}
