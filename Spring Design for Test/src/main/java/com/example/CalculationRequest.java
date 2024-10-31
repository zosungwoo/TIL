package com.example;

public class CalculationRequest {

    private final long n1;
    private final String operator;
    private final long n2;

    public CalculationRequest(String[] parts) {
        if (parts.length != 3) {
            throw new BadRequestException();
        }
        if (parts[1].length() != 1 || isInvalidOperator(parts[1])) {
            throw new InvalidOperatorException();
        }
        this.n1 = Long.parseLong(parts[0]);
        this.operator = parts[1];
        this.n2 = Long.parseLong(parts[2]);
    }

    private static boolean isInvalidOperator(String operator) {
        return !operator.equals("+") &&
                !operator.equals("-") &&
                !operator.equals("*") &&
                !operator.equals("/");
    }

    public long getN1() {
        return n1;
    }

    public String getOperator() {
        return operator;
    }

    public long getN2() {
        return n2;
    }
}
