package com.refactoring.duplication;

import java.util.Objects;

public final class Expense {

    private final String name;
    private final int cost;

    public Expense(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return cost == expense.cost &&
                Objects.equals(name, expense.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Expense{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
