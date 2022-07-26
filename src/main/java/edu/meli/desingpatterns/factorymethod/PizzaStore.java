package edu.meli.desingpatterns.factorymethod;

import edu.meli.desingpatterns.factorymethod.model.pizza.Pizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.PizzaStyle;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(PizzaStyle item);

	public Pizza orderPizza(PizzaStyle type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}