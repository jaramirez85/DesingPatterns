package edu.meli.desingpatterns.factorymethod.factory;

import edu.meli.desingpatterns.factorymethod.PizzaStore;
import edu.meli.desingpatterns.factorymethod.model.pizza.Pizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.PizzaStyle;
import edu.meli.desingpatterns.factorymethod.model.pizza.chicago.ChicagoStyleCheesePizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.chicago.ChicagoStyleClamPizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.chicago.ChicagoStylePepperoniPizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.chicago.ChicagoStyleVeggiePizza;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ChicagoPizzaStore extends PizzaStore {

	private static final Map<PizzaStyle, Supplier<Pizza>> PIZZA_TYPES= Collections.unmodifiableMap(new HashMap<PizzaStyle, Supplier<Pizza>>(){{
		put(PizzaStyle.cheese, ChicagoStyleCheesePizza::new);
		put(PizzaStyle.veggie, ChicagoStyleVeggiePizza::new);
		put(PizzaStyle.clam, ChicagoStyleClamPizza::new);
		put(PizzaStyle.pepperoni, ChicagoStylePepperoniPizza::new);
	}});


	@Override
	protected Pizza createPizza(PizzaStyle style) {
		return PIZZA_TYPES.get(style).get();
	}
}
