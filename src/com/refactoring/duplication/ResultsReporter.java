package com.refactoring.duplication;

import java.util.List;

public class ResultsReporter {

    public boolean evaluateResults(List<String> results) {
        printResultReport(results);
        return results.contains("deadlines met");
    }

    private void printResultReport(List<String> results) {
        System.out.println("##########");
        int counter = 1;
        for (String result : results) {
            StringBuilder sb = new StringBuilder();
            sb.append(counter).append(". ").append(result);
            System.out.println(sb);
            counter++;
        }
        System.out.println("##########");
    }
}
