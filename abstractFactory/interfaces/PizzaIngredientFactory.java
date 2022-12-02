package abstractFactory.interfaces;

//Абстрактная Фабрика определяет интерфейс создания семейства продуктов
public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Cheese createCheese();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
