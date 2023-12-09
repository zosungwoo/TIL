package org.example.stream;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample16 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(2,5,9,3,6,1);  // hashset에 담아보자

        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = s.peek(e -> set.add(e)).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(set);  // 순서가 없어 임의로 들어간 것임
    }
}
