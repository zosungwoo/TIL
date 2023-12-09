package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample14 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1,1,2,2,3,3);

        List<Integer> list = s.distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}
