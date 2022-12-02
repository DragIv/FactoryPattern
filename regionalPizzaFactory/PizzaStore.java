package regionalPizzaFactory;

public abstract class PizzaStore {
 
	public abstract Pizza createPizza(String item); //Объект фабрики перемещается в этот метод
 
	public Pizza orderPizza(String type) {

		Pizza pizza = createPizza(type); //управление передается одному из субклассов.

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
