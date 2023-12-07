package org.example.stream;

import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

        s.forEach(e -> System.out.println(e));  // 각각의 요소를 소비 (Consumer)

        s = Stream.of(1,2,3,4,5);
        s.map(e -> {
            if(e % 2 == 0)
                return true;
            else
                return false;
        });  // 각각의 요소를 다른 요소로 변환 (Function)

        // intermediate method이므로 수행이 안되었음 (map, filter, distinct, sorted, peek, limit, parallel

        // terminal method 필요
    }
}
