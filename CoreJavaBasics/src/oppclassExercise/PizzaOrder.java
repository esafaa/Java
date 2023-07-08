package oppclassExercise;

public class PizzaOrder {
	public Pizza[] pizzas;
	
//Constructor overloading
	public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3) {
		pizzas = new Pizza[3];
		for (int i = 0; i < pizzas.length; i++) {
			pizzas[0] = pizza1;
			pizzas[1] = pizza2;
			pizzas[2] = pizza3;
		}
	}
	public PizzaOrder(Pizza pizza1, Pizza pizza2) {
		pizzas = new Pizza[2];
		for (int i = 0; i < pizzas.length; i++) {
			pizzas[0] = pizza1;
			pizzas[1] = pizza2;
		
		}}
	
		public PizzaOrder(Pizza pizza1) {
			pizzas = new Pizza[0];
			pizzas[0] = pizza1;
				
		}
			
		
// method calculate the total cost of order
	public double calcTotal() {
		double totalCost = 0.0;
		for (int i = 0; i < pizzas.length; i++) {
			totalCost += pizzas[i].calcCost();
		}
		return totalCost;
	}
}
