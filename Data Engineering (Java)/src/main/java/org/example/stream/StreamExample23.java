package org.example.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample23 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(2,5,9,3,6,1);  // 비어있다면 최댓값(MAXVALUE)이 그대로 나옴
        Integer min = s.reduce(Integer.MAX_VALUE, Math::min);//  (e1, e2) -> Math.min(e1, e2)  MAX_VALUE와 모든 요소에 대해 최솟값 구하기
        System.out.println(min);

        s = Stream.of(2,5,9,3,6,1);  // 합
        Integer sum = s.reduce(0, (e1, e2) -> e1 + e2);
        System.out.println(sum);

        s = Stream.of(2,5,9,3,6,1);  // 곱
        Integer mul = s.reduce(1, (e1, e2) -> e1 * e2);
        System.out.println(mul);

    }
}
