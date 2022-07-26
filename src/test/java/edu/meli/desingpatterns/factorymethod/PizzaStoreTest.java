package edu.meli.desingpatterns.factorymethod;

import edu.meli.desingpatterns.factorymethod.model.pizza.Pizza;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("PizzaStoreTest")
class PizzaStoreTest {

    @DisplayName("Given an style and type it should create a pizza")
    @ParameterizedTest(name = "{index} => style={0}, type={1}, expected={2}")
    @MethodSource("provideParameters")
    void createPizzaTest(String style, String type, String expectedName) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.createPizza(style, type);
        assertEquals(expectedName, pizza.getName());
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("NY", "cheese", "NY Style Sauce and Cheese Pizza"),
                Arguments.of("NY", "clam", "NY Style Clam Pizza"),
                Arguments.of("NY", "pepperoni", "NY Style Pepperoni Pizza"),
                Arguments.of("NY", "veggie", "NY Style Veggie Pizza"),
                Arguments.of("Chicago", "cheese", "Chicago Style Deep Dish Cheese Pizza"),
                Arguments.of("Chicago", "clam", "Chicago Style Clam Pizza"),
                Arguments.of("Chicago", "pepperoni", "Chicago Style Pepperoni Pizza"),
                Arguments.of("Chicago", "veggie", "Chicago Deep Dish Veggie Pizza")
        );
    }
}