package edu.meli.desingpatterns.strategy.strategies;

public class AmericanExpressCreditCardBrandStrategy implements CreditCardBrandStrategy {
    @Override
    public boolean matches(String num) {
        return num.startsWith("37") || num.startsWith("34") && 15L == num.length();
    }

    @Override
    public String getName() {
        return "American Express";
    }
}
