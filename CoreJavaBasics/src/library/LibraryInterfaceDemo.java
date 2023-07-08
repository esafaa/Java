package library;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		// Test case #1 
		// creation of two kids with different ages and requests of Book
		KidUser kid1=new KidUser(10,"Kids");// valid
		KidUser kid2=new KidUser(18,"Fiction");// invalid
		
		
		// Test case 2 # 
		// creation of two adults with different ages and requests of Book
		
AdultUser adult1= new AdultUser(5,"Kids"); // invalid

AdultUser adult2= new AdultUser(23,"Fiction"); //valid



kid1.registerAccount();//invoke the registerAccount() method of the kidUser object.
kid1.requestBook();// invoke the requestBook() method of the kidUser object.

// invalid kid2
kid2.registerAccount();
kid2.requestBook();

//invalid adult1
adult1.registerAccount();//invoke the registerAccount() method of the AdultUser object.
adult1.requestBook();// invoke the requestBook() method of the AdultUser object.

adult2.registerAccount();
adult2.requestBook();

	}

}
