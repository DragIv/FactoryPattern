package regionalPizzaFactory;

import regionalPizzaFactory.ChicagoPizza.ChicagoPizzaStore;
import regionalPizzaFactory.NYPizza.NYPizzaStore;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Order a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Order a " + pizza.getName() + "\n");

	}
}
