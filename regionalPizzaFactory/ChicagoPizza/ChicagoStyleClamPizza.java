package regionalPizzaFactory.ChicagoPizza;

import regionalPizzaFactory.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "Chicago style Clam Pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";

		toppings.add("Frozen clams from chesapeake bay");
	}

	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
