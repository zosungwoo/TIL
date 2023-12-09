package org.example.stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample4 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

        s.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {  // 각 요소에 대해 test를 수행하고 true, false를 반환하도록 하며 true만 유지
                if (integer % 2 == 0) {
                    return true;
                }
                return false;
            }
        }).forEach(e -> System.out.println(e));
    }
}
