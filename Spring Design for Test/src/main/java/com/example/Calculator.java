package com.example;

public class Calculator {

    public long calculate(long n1, String operator, long n2) {
        return switch (operator) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> throw new InvalidOperatorException();
        };
    }
}
