package abstractFactory;

import abstractFactory.Ingredients.FreshClams;
import abstractFactory.Ingredients.ReggianoCheese;
import abstractFactory.Ingredients.SlicedPepperoni;
import abstractFactory.Ingredients.ThinCrustDough;
import abstractFactory.interfaces.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
