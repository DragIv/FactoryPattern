package regionalPizzaFactory.ChicagoPizza;

import regionalPizzaFactory.Pizza;
import regionalPizzaFactory.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		return switch (item) {
			case "cheese" -> new ChicagoStyleCheesePizza();
			case "clam" -> new ChicagoStyleClamPizza();
			default -> null;
		};
	}
}
