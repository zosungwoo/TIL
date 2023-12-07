package org.example.stream;

import java.util.*;
import java.util.stream.Stream;

public class Creation {
    public static void main(String[] args) {
        // instance 들을 통해 만드릭
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4);

        // array를 통해 만들기
        String[] str= new String[3];
        str[0] = "a";
        str[1] = "b";
        str[2] = "c";
        Stream<String> s2 = Arrays.stream(str);

        // Collection을 통해 만들기
        List<Integer> list = List.of(1, 2, 3, 4);
        new ArrayDeque<Integer>(list).stream();
        new LinkedList<Integer>(list).stream();
        new HashSet<Integer>(list).stream();
        new TreeSet<Integer>(list).stream();

        Map<String, String> map = Map.of("Jack", "Data Engineering");
        new HashMap<String, String>(map).entrySet().stream();
        new HashMap<String, String>(map).keySet().stream();
        new HashMap<String, String>(map).values().stream();
    }
}
