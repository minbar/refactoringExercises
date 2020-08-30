package com.refactoring.featureEnvy;

public class BodyBuilderUtil {

    public int calculateSquatLift(BodyBuilder bodyBuilder, int reps) {
        return bodyBuilder.getSquatMax() / reps * 2;
    }

    public int calculateBenchPressWeight(BodyBuilder bodyBuilder, int reps) {
        return bodyBuilder.getBenchPressMax() / reps * 3;
    }
}
