package edu.meli.desingpatterns.strategy.strategies;

public class DiscoverCreditCardBrandStrategy implements CreditCardBrandStrategy {
    @Override
    public boolean matches(String num) {
        return num.startsWith("6") && num.length() >= 16L && num.length() <= 19L;
    }

    @Override
    public String getName() {
        return "Discover";
    }
}
