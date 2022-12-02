package regionalPizzaFactory.NYPizza;

import regionalPizzaFactory.Pizza;
import regionalPizzaFactory.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		return switch (item) {
			case "cheese" -> new NYStyleCheesePizza();
			case "clam" -> new NYStyleClamPizza();
			case "pepperoni" -> new NYStylePepperoniPizza();
			default -> null;
		};
	}
}
