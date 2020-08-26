package com.refactoring.naming;

public class Main {

    public static void main(String[] args) {
        String fn = "John";
        String ln = "Johnson";

        Person JOHNJOHNSONPERSON = new Person(fn, ln, 25);

        String message_to_be_printed = "Saving person" + JOHNJOHNSONPERSON.toString();
        System.out.println(message_to_be_printed);
    }
}
