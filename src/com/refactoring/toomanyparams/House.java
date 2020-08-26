package com.refactoring.toomanyparams;

import java.util.Objects;

public class House {

    private final String address;
    private final int yearBuilt;
    private final int squareMeters;
    private final int numberOfBedrooms;

    public House(String address, int yearBuilt, int squareMeters, int numberOfBedrooms) {
        this.address = address;
        this.yearBuilt = yearBuilt;
        this.squareMeters = squareMeters;
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public String getAddress() {
        return address;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return yearBuilt == house.yearBuilt &&
                squareMeters == house.squareMeters &&
                numberOfBedrooms == house.numberOfBedrooms &&
                Objects.equals(address, house.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, yearBuilt, squareMeters, numberOfBedrooms);
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", yearBuilt=" + yearBuilt +
                ", squareMeters=" + squareMeters +
                ", numberOfBedrooms=" + numberOfBedrooms +
                '}';
    }
}
