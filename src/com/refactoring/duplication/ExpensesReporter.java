package com.refactoring.duplication;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ExpensesReporter {

    public int calculateProfits(List<Expense> expenses, int revenue) {
        List<String> expenseNames = expenses.stream()
                .map(Expense::getName)
                .collect(toList());
        printExpensesReport(expenseNames);
        return revenue - expenses.stream().map(Expense::getCost).reduce(0, Integer::sum);
    }

    private void printExpensesReport(List<String> expenses) {
        System.out.println("##########");
        int counter = 1;
        for (String result : expenses) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(counter).append(". ").append(result);
            System.out.println(stringBuilder);
            counter++;
        }
        System.out.println("##########");
    }
}
