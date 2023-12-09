package org.example.stream;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class StreamExample8 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1,2,3,4,5);

        // 1,2,3,4,5 --> "12345"
        // collect : stream의 요소들을 모아주는 역할
        StringBuilder b = s.collect(new Supplier() {
            @Override
            public Object get() {
                return new StringBuilder();  // String Builder: Immutable(불변)한 String과 달리 가변적이며 String을 담는 클래스
            }
        }, new BiConsumer<StringBuilder, Integer>() {

            @Override
            public void accept(StringBuilder stringBuilder, Integer integer) {
                stringBuilder.append(integer);
            }
        }, (b1, b2) -> {});

        System.out.println(b.toString());
    }
}
