package edu.meli.desingpatterns.strategy;

import edu.meli.desingpatterns.strategy.strategies.*;

import java.util.Arrays;
import java.util.List;

/*
Based on List of credit card number formats
https://www.freeformatter.com/credit-card-number-generator-validator.html
 */
public class BrandCreditCardResolver {

    private final List<CreditCardBrandStrategy> strategies;

    public BrandCreditCardResolver() {
        strategies = Arrays.asList(
                new VisaCreditCardBrandStrategy(),
                new MasterCardCreditCardBrandStrategy(),
                new AmericanExpressCreditCardBrandStrategy(),
                new DiscoverCreditCardBrandStrategy()
        );
    }

    public String getBrand(long number) {
        return strategies
                .stream()
                .filter(strategy -> strategy.matches(String.valueOf(number)))
                .findFirst()
                .map(CreditCardBrandStrategy::getName)
                .orElse("Unknown");
    }

}
