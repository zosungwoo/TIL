package org.example.stream;

import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

        s.forEach(e -> System.out.println(e));

        s = Stream.of(1,2,3,4,5);
        s.map(e -> {
            if(e % 2 == 0)
                return true;
            else
                return false;
        }).forEach(e -> System.out.println(e));  // forEach(terminal method)에 도달 해야 map이 수행되며 마지막으로 foreach 수행
    }
}
