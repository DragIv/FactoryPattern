package regionalPizzaFactory.NYPizza;

import regionalPizzaFactory.Pizza;

public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza() {
		name = "NY Style pepperoni pizza";
		dough = "Thin crust dough";
		sauce = "Marinara sauce";
 
		toppings.add("Grated reggiano");
		toppings.add("Sliced pepperoni");
	}
}
