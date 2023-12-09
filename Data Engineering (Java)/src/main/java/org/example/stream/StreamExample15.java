package org.example.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample15 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(2,5,9,3,6,1);

        List<Integer> list = s.sorted().collect(Collectors.toList());
        System.out.println(list);
    }
}
