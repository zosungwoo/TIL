package org.example.stream;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample17 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(2,5,9,3,6,1);
        List<Integer> list = s.limit(2).collect(Collectors.toList());

        s = Stream.of(2,5,9,3,6,1);
        List<Integer> list2 = s.skip(2).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);
    }
}
