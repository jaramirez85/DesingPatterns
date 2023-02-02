package edu.meli.desingpatterns.strategy.strategies;

public interface CreditCardBrandStrategy {
    boolean matches(String number);
    String getName();
}
