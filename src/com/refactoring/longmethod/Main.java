package com.refactoring.longmethod;

public class Main {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println("the taxes for a purchase of 100 dollars of digital goods in Lithuania are:");
        System.out.println(taxCalculator.calculateTaxes("LT", 100, PurchaseType.DIGITAL));
    }
}
