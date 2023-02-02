package edu.meli.desingpatterns.strategy;

import edu.meli.desingpatterns.state.Ventilador;
import edu.meli.desingpatterns.state.states.ApagadoState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrandCreditCardResolverTest {

    @Test
    void given_a_cardNumber_then_should_resolve_brand() {

        BrandCreditCardResolver resolver = new BrandCreditCardResolver();

        assertEquals("Visa", resolver.getBrand(4556440054335227L));
        assertEquals("Visa", resolver.getBrand(4024007152386998502L));
        assertEquals("Discover", resolver.getBrand(6011299062250784L));
        assertEquals("Discover", resolver.getBrand(6011425054957610434L));
        assertEquals("MasterCard", resolver.getBrand(2221004369085379L));
        assertEquals("MasterCard", resolver.getBrand(5550932313253731L));
        assertEquals("American Express", resolver.getBrand(346625992381373L));
        assertEquals("American Express", resolver.getBrand(347168019215018L));
        assertEquals("American Express", resolver.getBrand(374494141558026L));
        assertEquals("Unknown", resolver.getBrand(1L));

    }

}