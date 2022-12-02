package abstractFactory;

import abstractFactory.interfaces.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		cheese = ingredientFactory.createCheese();
	}

	// Когда ему требуется очередной ингредиент,
	// он запрашивает его у фабрики.
}
