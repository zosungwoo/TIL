package org.example.stream;

import java.util.Comparator;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class StreamExample7 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(3,2,5,1,4);

        // 입력 t를 받아 int로 변환
        // Stream<Integer> -> IntStream (Integer로 정확하게 보장되기 때문에 추가적인 기능 제공 가능 ex sum)
        int sum = s.mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer value) {
                return value;
            }
        }).sum();
        System.out.println(sum);
    }
}
