package org.example.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample22 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(2,5,9,3,6,1);

        // optional은 non null stream의 결과로, 비어 있지 않은 결과의 추상화 (null 있다면 수행 불가)
        Optional<Integer> optional = s.reduce((e1, e2) -> {
            if (e1 < e2)
                return e1;
            else
                return e2;
        });
        System.out.println(optional.get());

        // 비어있거나 null 있다면 empth, 오류
        s = Stream.of();
        Optional<Integer> optional2 = s.reduce((e1, e2) -> {
            if (e1 < e2)
                return e1;
            else
                return e2;
        });
        System.out.println(optional2);
    }
}
