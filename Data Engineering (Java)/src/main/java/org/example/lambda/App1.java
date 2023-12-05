package org.example.lambda;

public class App1 {
    public static void main(String[] args) {
        double sum = new SumThreeIntegers().compute(3, 4, 5);  // 클래스 따로 생성하여 클래스에서 구현
        System.out.println(sum);

        sum = new ComputeThreeIntegers() {  // 익명클래스로 compute 구현
            @Override
            public double compute(int x, int y, int z) {
                return x+y+z;
            }
        }.compute(3,4,5);
        System.out.println(sum);
    }
}
