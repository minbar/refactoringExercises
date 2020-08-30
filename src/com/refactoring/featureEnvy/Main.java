package com.refactoring.featureEnvy;

public class Main {

    public static void main(String[] args) {
        BodyBuilderUtil bodyBuilderUtil = new BodyBuilderUtil();
        BodyBuilder bodyBuilder = new BodyBuilder("Tom", 26, 200, 300);
        System.out.println("Tom Should work with bench press weight for 8 reps:");
        System.out.println(bodyBuilderUtil.calculateBenchPressWeight(bodyBuilder,8));
    }
}
