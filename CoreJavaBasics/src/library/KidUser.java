package library;

public class KidUser implements LibraryUser {


	
	public int age;
	public String bookType;
	
	
	//Constructor
	public KidUser(int age, String bookType) {
		this.age=age;
		this.bookType=bookType;
	}


// Implementation of 2 abstract methods
	public void registerAccount() {
		if (age < 11) { //check the test of user
			System.out.println("You have successfully registered under a Kids Account");
		} else {

			System.out.println("Sorry, age must be less than 12 to register as a kid.");
		}
	}
	
	public void requestBook() {
		if (bookType.equalsIgnoreCase("kids")) { //check the type of book
			System.out.println("Book issued successfully, please return the book within 10 days");
		}else {
			System.out.println("Oops, you are allowed to take only kids books.");
		}
	}
}
