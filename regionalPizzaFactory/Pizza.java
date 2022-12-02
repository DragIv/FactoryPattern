package regionalPizzaFactory;

import java.util.ArrayList;

//Задача Фабричного Метода - перемещение создания экземпляров в субклассы

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	public ArrayList<String> toppings = new ArrayList<>();
 
	public void prepare() {
		System.out.println("Prepare " + name);
		for (String topping : toppings) {
			System.out.println(topping);
		}
	}

	public void bake() {
		System.out.println("baking..");
	}

	public void cut() {
		System.out.println("сutting..");
	}

	public void box() {
		System.out.println("placement in a box");
	}
 
	public String getName() {
		return name;
	}

}

 
 
