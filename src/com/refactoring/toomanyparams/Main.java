package com.refactoring.toomanyparams;

public class Main {

    public static void main(String[] args) {
        PriceEstimator priceEstimator = new PriceEstimator();
        House house = new House("Kings st. 145", 1974,
                120, 4);
        System.out.println("The estimated price of the house is:");
        System.out.println(priceEstimator.estimatePrice(house.getAddress(), house.getYearBuilt(),
                house.getNumberOfBedrooms(), house.getSquareMeters()));
    }
}
