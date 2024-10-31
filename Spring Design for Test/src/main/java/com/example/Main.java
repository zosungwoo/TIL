package com.example;

public class Main {
    public static void main(String[] args) {
        CalculationRequest calculationRequest = new CalculationRequestReader().read();
        long answer = new Calculator().calculate(
                calculationRequest.getN1(),
                calculationRequest.getOperator(),
                calculationRequest.getN2()
        );
        System.out.println(answer);
    }
}