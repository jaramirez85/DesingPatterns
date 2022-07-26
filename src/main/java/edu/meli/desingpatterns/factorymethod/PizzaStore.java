package edu.meli.desingpatterns.factorymethod;

import edu.meli.desingpatterns.factorymethod.model.pizza.Pizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.chicago.ChicagoStyleCheesePizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.chicago.ChicagoStyleClamPizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.chicago.ChicagoStylePepperoniPizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.chicago.ChicagoStyleVeggiePizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.ny.NYStyleCheesePizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.ny.NYStyleClamPizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.ny.NYStylePepperoniPizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.ny.NYStyleVeggiePizza;

public class PizzaStore {
 
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
