package org.example.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample11 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1,2,3,4,5,6);

        System.out.println(s.map(e -> e*2).collect(Collectors.toList()));
    }
}
