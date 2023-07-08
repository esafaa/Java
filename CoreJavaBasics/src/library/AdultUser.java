package library;

public class AdultUser implements LibraryUser{
	//Instance Fields
	public int age;
	public String bookType;
	
	//Constructor
	public AdultUser(int age, String bookType) {
		this.age=age;
		this.bookType=bookType;
	}

	
	// Implementation of 2 abstract methods
	public void registerAccount() {
		if (age >= 12) { //check the test of user
			System.out.println("You have successfully registered under an Adult Account.");
		} else if(age<=11) {

			System.out.println("Sorry, age must be greater than 12 to register as an adult.");
		}
	}
	
	public void requestBook() { 
		if (bookType.equalsIgnoreCase("Fiction")) { //check the type of book
			System.out.println("Book Issued successfully, please return the book within 7 days.");
		}else {
			System.out.println("Oops, you are allowed to take only adult Fiction books.");
		}
	}
	
}
