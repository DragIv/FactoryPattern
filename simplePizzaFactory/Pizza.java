package simplePizzaFactory;

import java.util.*;

abstract public class Pizza {
	String name;
	List<String> toppings = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
	}

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name);
	}

	public String toString() {
		StringBuilder display = new StringBuilder();
		display.append(name).append(": ");
		for (String topping : toppings) {
			display.append(topping).append("; ");
		}
		return display.toString();
	}
}

