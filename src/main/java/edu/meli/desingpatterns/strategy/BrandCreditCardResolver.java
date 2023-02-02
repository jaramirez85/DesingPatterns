package edu.meli.desingpatterns.strategy;

import java.util.Arrays;

/*
Based on List of credit card number formats
https://www.freeformatter.com/credit-card-number-generator-validator.html
 */
public class BrandCreditCardResolver {

    public String getBrand(long number) {
        String num = number + "";
        if (num.startsWith("4") && Arrays.asList(13, 16, 19).contains(num.length())) {
            return "Visa";
        } else if ((num.startsWith("5") || num.startsWith("22")) && 16L == num.length()) {
            return "MasterCard";
        } else if (num.startsWith("37") || num.startsWith("34") && 15L == num.length()) {
            return "American Express";
        } else if (num.startsWith("6") && num.length() >= 16L && num.length() <= 19L  ) {
            return "Discover";
        } else {
            return "Unknown";
        }
    }

}
