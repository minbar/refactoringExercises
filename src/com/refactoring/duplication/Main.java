package com.refactoring.duplication;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ExpensesReporter expensesReporter = new ExpensesReporter();
        ResultsReporter resultsReporter = new ResultsReporter();

        List<Expense> expenses = List.of(new Expense("building materials", 2000),
                new Expense("Labor", 1500));
        List<String> results = List.of("deadlines met", "garage built");
        System.out.println(expensesReporter.calculateProfits(expenses, 6000));
        System.out.println(resultsReporter.evaluateResults(results));
    }
}
