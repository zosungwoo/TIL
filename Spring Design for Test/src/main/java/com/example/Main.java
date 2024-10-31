package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers and an operator (e.g 1 + 2)");
        String result = scanner.nextLine();
        String[] parts = result.split(" ");

        long n1 = Long.parseLong(parts[0]);
        long n2 = Long.parseLong(parts[2]);
        String operator = parts[1];
        long answer;

        switch (operator) {
            case "+":
                answer = n1 + n2;
                break;
            case "-":
                answer = n1 - n2;
                break;
            case "*":
                answer = n1 * n2;
                break;
            case "/":
                answer = n1 / n2;
                break;
            default:
                throw new InvalidOperatorException();
        }

        System.out.println(answer);
    }
}