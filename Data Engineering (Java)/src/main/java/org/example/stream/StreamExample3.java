package org.example.stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample3 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

        s.forEach(new Consumer<Integer>() {  // 각 요소 소비
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
