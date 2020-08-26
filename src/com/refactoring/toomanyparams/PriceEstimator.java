package com.refactoring.toomanyparams;

public class PriceEstimator {

        public int estimatePrice(String address, int yearBuilt, int nrOfBedrooms, int squareMeters) {
            int pricePerSquareMeter = 1000;
            if (yearBuilt > 2000) {
                pricePerSquareMeter +=500;
            } else if (yearBuilt < 1950) {
                pricePerSquareMeter -= 200;
            }

            if (nrOfBedrooms < 4) {
                pricePerSquareMeter -= 100;
            }

            if (address.contains("Kings st.")) {
                pricePerSquareMeter += 300;
            }

            return pricePerSquareMeter * squareMeters;
        }
}
