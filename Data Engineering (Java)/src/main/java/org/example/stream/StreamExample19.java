package org.example.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample19 {
    public static void main(String[] args) {
        System.out.println(Stream.of(2,5,9,3,6,1).count());
        System.out.println(Stream.of(2,5,9,3,6,1).min((e1, e2) -> {
            if(e1 < e2) return -1;
            else if(e1 == e2) return 0;
            else return 1;
        }).get());
        System.out.println(Stream.of(2,5,9,3,6,1).max((e1, e2) -> {
            if(e1 < e2) return -1;
            else if(e1 == e2) return 0;
            else return 1;
        }).get());
        System.out.println(Stream.of(2,5,9,3,6,1).findFirst().get());
    }
}
