package com.refactoring.featureEnvy;

public final class BodyBuilder {

    private final String name;
    private final int age;
    private final int benchPressMax;
    private final int squatMax;

    public BodyBuilder(String name, int age, int benchPressMax, int squatMax) {
        this.name = name;
        this.age = age;
        this.benchPressMax = benchPressMax;
        this.squatMax = squatMax;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBenchPressMax() {
        return benchPressMax;
    }

    public int getSquatMax() {
        return squatMax;
    }
}
