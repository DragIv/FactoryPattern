package simplePizzaFactory;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		return switch (type) {
			case "cheese" -> new CheesePizza();
			case "pepperoni" -> new PepperoniPizza();
			case "clam" -> new ClamPizza();
			default -> null;
		};
	}
}
