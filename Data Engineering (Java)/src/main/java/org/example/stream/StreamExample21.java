package org.example.stream;

import java.util.function.IntFunction;
import java.util.stream.Stream;

public class StreamExample21 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(2,5,9,3,6,1);

        Object[] arr = s.toArray();
        for (Object val :
                arr) {
            System.out.println(val);
        }
        System.out.println();

        s = Stream.of(2,5,9,3,6,1);
        Integer[] arr2 = s.toArray(Integer[]::new
//                new IntFunction<Integer[]>() {
//            @Override
//            public Integer[] apply(int value) {
//                return new Integer[value];
//            }
//        }
        );
        for (Object val :
                arr2) {
            System.out.println(val);
        }
        System.out.println();

        s = Stream.of(2,5,9,3,6,1);
        s.forEach(System.out::println);

    }
}
