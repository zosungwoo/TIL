package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성

        // Arrays.stream()
        int[] scores = {100,95,99,91,80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "C"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();
        // langList.add("python");
        langList = Arrays.asList("python", "java", "C");
//        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "C");


        // 스트림 사용
        // 중간 연산 (Intermediate Operation): filter, map, sorted, distinct, skip, ...
        // 최종 연산 (Terminal Operation): count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        System.out.println("---------------");


    }
}
