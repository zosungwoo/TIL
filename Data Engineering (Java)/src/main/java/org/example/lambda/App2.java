package org.example.lambda;

public class App2 {
    public static void main(String[] args) {
        ComputeThreeIntegers cti = new ComputeThreeIntegers() {
            @Override
            public double compute(int x, int y, int z) {
                return x+y+z;
            }
        };
        System.out.println(cti.compute(3,4,5));


        // 람다 표현식
        ComputeThreeIntegers cti2 = (int x, int y, int z) -> {
            return x + y + z;
        };
        System.out.println(cti2.compute(3,4,5));
        // funtional interface 이기 때문에 가능
    }
}
