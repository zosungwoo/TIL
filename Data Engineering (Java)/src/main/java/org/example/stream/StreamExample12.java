package org.example.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample12 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("a,b,c", "d,e", "f", "g,h");

        List<String[]> list = s.map(e -> e.split(",")).collect(Collectors.toList());
        for (String[] arr:
             list) {
            System.out.println(arr);  // [a,b,c]    [d,e]   [f]   [g,h]
        }


    }
}
