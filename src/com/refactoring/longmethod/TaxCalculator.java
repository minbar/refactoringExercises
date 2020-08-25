package com.refactoring.longmethod;

import java.util.List;

public class TaxCalculator {

    private final List<String> supportedLocales = List.of("US", "CA", "LT");

    public double calculateTaxes(String locale, int purchaseAmount, PurchaseType purchaseType) {
        if (!supportedLocales.contains(locale)) {
            throw new IllegalArgumentException();
        }

        if (purchaseAmount < 0) {
            throw new IllegalArgumentException();
        }

        if (purchaseType == null) {
            throw new IllegalArgumentException();
        }

        double baseTax;
        switch (locale) {
            case "US":
                baseTax = 0.1;
                break;
            case "CA":
                baseTax = 0.2;
                break;
            case "LT":
                baseTax = 0.3;
                break;
            default:
                throw new IllegalArgumentException();
        }

        double physicalGoodsTax;
        if (PurchaseType.PHYSICAL.equals(purchaseType)) {
            physicalGoodsTax = 0.1;
        } else {
            physicalGoodsTax = 0;
        }

        return (baseTax + physicalGoodsTax) * purchaseAmount;
    }
}
