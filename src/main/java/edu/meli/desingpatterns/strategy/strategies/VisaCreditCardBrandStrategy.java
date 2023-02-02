package edu.meli.desingpatterns.strategy.strategies;

import java.util.Arrays;

public class VisaCreditCardBrandStrategy implements CreditCardBrandStrategy{
    @Override
    public boolean matches(String num) {
        return num.startsWith("4") && Arrays.asList(13, 16, 19).contains(num.length());
    }

    @Override
    public String getName() {
        return "Visa";
    }
}
