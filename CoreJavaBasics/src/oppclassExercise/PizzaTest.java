package oppclassExercise;

public class PizzaTest {

	public static void main(String[] args) {
	Pizza pizza1= new Pizza("Large",1,2,2);
	Pizza pizza2= new Pizza("small",2,1,2);


PizzaOrder order=  new PizzaOrder(pizza1,pizza2);

for(int i =0;i<order.pizzas.length;i++) {
	System.out.println(order.pizzas[i].getDescription());
	System.out.println("The cost of your pizza is $"+(order.pizzas[i].calcCost()));
}

System.out.println("The total of your order :$"+order.calcTotal());
	}

}
