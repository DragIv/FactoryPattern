package abstractFactory;

import abstractFactory.Ingredients.FrozenClams;
import abstractFactory.Ingredients.MozzarellaCheese;
import abstractFactory.Ingredients.SlicedPepperoni;
import abstractFactory.Ingredients.ThickCrustDough;
import abstractFactory.interfaces.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
