package edu.meli.desingpatterns.strategy.strategies;

public class MasterCardCreditCardBrandStrategy implements CreditCardBrandStrategy{
    @Override
    public boolean matches(String num) {
        return (num.startsWith("5") || num.startsWith("22")) && 16L == num.length();
    }

    @Override
    public String getName() {
        return "MasterCard";
    }
}
