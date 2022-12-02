package abstractFactory;

import abstractFactory.interfaces.Cheese;
import abstractFactory.interfaces.Clams;
import abstractFactory.interfaces.Dough;
import abstractFactory.interfaces.Pepperoni;

//На основе Абстрактной Фабрики создается одна или несколько конкретных
//фабрик, производящих одинаковые продукты, но с разными реализациями.
public abstract class Pizza {
	public String name;
	public Dough dough;
	public Cheese cheese;
	public Pepperoni pepperoni;
	public Clams clam;

	abstract void prepare(); // будем собирать ингредиенты, необходимые для приготовления

	public void bake() {
		System.out.println("baking..");
	}

	public void cut() {
		System.out.println("сutting..");
	}

	public void box() {
		System.out.println("placement in a box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}


}
