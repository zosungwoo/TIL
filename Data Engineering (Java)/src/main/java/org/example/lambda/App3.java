package org.example.lambda;

public class App3 {
    public static void main(String[] args) {

        ComputeThreeIntegers cti2 = (a, b, c) -> a + b + c;
        System.out.println(cti2.compute(3,4,5));

        CalculateRadius cr = r -> r * r * 3.14;
        System.out.println(cr.calculate(3));

    }
}
