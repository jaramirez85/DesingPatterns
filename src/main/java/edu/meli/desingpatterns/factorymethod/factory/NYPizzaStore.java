package edu.meli.desingpatterns.factorymethod.factory;

import edu.meli.desingpatterns.factorymethod.PizzaStore;
import edu.meli.desingpatterns.factorymethod.model.pizza.Pizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.PizzaStyle;
import edu.meli.desingpatterns.factorymethod.model.pizza.ny.NYStyleCheesePizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.ny.NYStyleClamPizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.ny.NYStylePepperoniPizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.ny.NYStyleVeggiePizza;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NYPizzaStore extends PizzaStore {

	private static final Map<PizzaStyle, Supplier<Pizza>> PIZZA_TYPES= Collections.unmodifiableMap(new HashMap<PizzaStyle, Supplier<Pizza>>(){{
		put(PizzaStyle.cheese, NYStyleCheesePizza::new);
		put(PizzaStyle.veggie, NYStyleVeggiePizza::new);
		put(PizzaStyle.clam, NYStyleClamPizza::new);
		put(PizzaStyle.pepperoni,NYStylePepperoniPizza::new);
	}});

	@Override
	protected Pizza createPizza(PizzaStyle style) {
		return PIZZA_TYPES.get(style).get();
	}
}
