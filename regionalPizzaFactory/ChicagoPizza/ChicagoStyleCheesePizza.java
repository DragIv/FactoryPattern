package regionalPizzaFactory.ChicagoPizza;

import regionalPizzaFactory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago style deep dish Cheese Pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";
 
		toppings.add("Shredded mozzarella");
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
