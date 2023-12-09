package org.example.stream;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamExample9 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1,2,3,4,5);

        // reduce - terminal method
        Optional<Integer> opt = s.reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {  // 쌍이 두어졌을 때 단인 반환값을 계속해서 반환
                return integer > integer2 ? integer : integer2;
            }
        });
        System.out.println(opt.get());
    }
}
