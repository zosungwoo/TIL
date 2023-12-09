package org.example.stream;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class StreamExample5_2 {
    public static void main(String[] args) {
        Stream<Double> s = Stream.of(1d,2d,3d,4d,5d);

        // 입력 t를 받아 아래 r 타입의 값을 반환
        Double[] array = s.toArray(new IntFunction<Double[]>() {
            @Override
            public Double[] apply(int value) {  // 크기 의미
                return new Double[value];
            }
        });
        for (double v :
                array) {
            System.out.println(v);
        }


        // 람다표현식
        s = Stream.of(1d,2d,3d,4d,5d);
        for(double v: s.toArray(value -> new Double[value])){
            System.out.println(v);
        }

        s = Stream.of(1d,2d,3d,4d,5d);
        for(double v: s.toArray(Double[]::new)){
            System.out.println(v);
        }

        s = Stream.of(1d,2d,3d,4d,5d);
        s.forEach(System.out::println);
    }
}
