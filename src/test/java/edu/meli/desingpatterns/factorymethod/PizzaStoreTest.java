package edu.meli.desingpatterns.factorymethod;

import edu.meli.desingpatterns.factorymethod.factory.ChicagoPizzaStore;
import edu.meli.desingpatterns.factorymethod.factory.NYPizzaStore;
import edu.meli.desingpatterns.factorymethod.model.pizza.Pizza;
import edu.meli.desingpatterns.factorymethod.model.pizza.PizzaStyle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("PizzaStoreTest")
class PizzaStoreTest {

    @DisplayName("Given an style and type it should create a pizza")
    @ParameterizedTest(name = "{index} => clazz={0}, type={1}, expected={2}")
    @MethodSource("provideParameters")
    void createPizzaTest(Class clazz, PizzaStyle type, String expectedName) {
        PizzaStore pizzaStore = createInstance(clazz);
        Pizza pizza = pizzaStore.createPizza(type);
        assertEquals(expectedName, pizza.getName());
    }

    private <T> T createInstance(Class clazz) {
        try {
            return (T) clazz.getConstructors()[0].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(NYPizzaStore.class, PizzaStyle.cheese, "NY Style Sauce and Cheese Pizza"),
                Arguments.of(NYPizzaStore.class, PizzaStyle.clam, "NY Style Clam Pizza"),
                Arguments.of(NYPizzaStore.class, PizzaStyle.pepperoni, "NY Style Pepperoni Pizza"),
                Arguments.of(NYPizzaStore.class, PizzaStyle.veggie, "NY Style Veggie Pizza"),
                Arguments.of(ChicagoPizzaStore.class, PizzaStyle.cheese, "Chicago Style Deep Dish Cheese Pizza"),
                Arguments.of(ChicagoPizzaStore.class, PizzaStyle.clam, "Chicago Style Clam Pizza"),
                Arguments.of(ChicagoPizzaStore.class, PizzaStyle.pepperoni, "Chicago Style Pepperoni Pizza"),
                Arguments.of(ChicagoPizzaStore.class, PizzaStyle.veggie, "Chicago Deep Dish Veggie Pizza")
        );
    }
}