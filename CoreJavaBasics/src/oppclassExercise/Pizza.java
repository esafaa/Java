package oppclassExercise;

public class Pizza {
	
	//Private instance Variables
private String size; //size of the pizza
private int numOfCheese;  //number of cheese toppings
private int numOfpepperoni;//number of pepperoni toppings
private int numOfHam; //number of ham toppings

// Constructor that set all of the variables
public Pizza(String size,int numOfCheese,int numOfpepperoni,int numOfHam) {
	setSize(size);
	setNumOfToppings(numOfCheese);
	setNumOfpepperoni(numOfpepperoni);
	setNumOfHam(numOfHam);
}


//Getters and Setters
public String getSize() {
	return size;
}


public void setSize(String size) {
	this.size=size;
}

public int getNumOfCheese() {
	return numOfCheese;
}

public void setNumOfToppings(int numOfToppings) {
	this.numOfCheese = numOfToppings;
}

public int getNumOfpepperoni() {
	return numOfpepperoni;
}

public void setNumOfpepperoni(int numOfpepperoni) {
	this.numOfpepperoni = numOfpepperoni;
}

public int getNumOfHam() {
	return numOfHam;
}

public void setNumOfHam(int numOfHam) {
	this.numOfHam = numOfHam;
}
public double calcCost() {
	double cost=0;
	cost=(getNumOfCheese()+getNumOfpepperoni()+getNumOfHam())*2;
	if (size.equalsIgnoreCase("small")) {
		cost+=10;
	}else if (size.equalsIgnoreCase("medium")) {
		cost+=12;
	}else if (size.equalsIgnoreCase("large")) {
		cost+=14;
}return cost;


}
public String getDescription() {
String description= "You ordered a "+getSize()+" pizza with "+getNumOfCheese()+" cheese , "+getNumOfpepperoni()+" pepperoni and "+getNumOfHam()+" ham toppings.";
return description;
}

}
