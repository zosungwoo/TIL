package org.example.stream;

import java.util.stream.Stream;

public class StreamExample20 {
    public static void main(String[] args) {
        System.out.println(Stream.of(2,5,9,3,6,1).anyMatch(e -> e > 8));
        System.out.println(Stream.of(2,5,9,3,6,1).allMatch(e -> e > 8));
        System.out.println(Stream.of(2,5,9,3,6,1).noneMatch(e -> e > 8));  // 전부다 통과 못해야지 true
    }
}
