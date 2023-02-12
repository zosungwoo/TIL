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
        int[] scores = {100,95,85,91,80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "c", "c++"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();
        // langList.add("python");
        langList = Arrays.asList("python", "java", "c", "c++");
//        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "c", "c++");


        // 스트림 사용
        // 중간 연산 (Intermediate Operation): filter, map, sorted, distinct, skip, ...
        // 최종 연산 (Terminal Operation): count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
//        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("---------------");

        // 90점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("--------------");

        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x > 90).sum();
        System.out.println(sum);
        System.out.println("-----------");

        // 90점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("-------------");

        // c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("-------------");

        // java라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("-------------");

        // 4글자 이하의 언어를 정렬하여 출력 (Collection.stream을 사용)
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("-------------");

        // 4글자 이하의 언어 중 c라는 글자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);
        System.out.println("-------------");

        // 4글자 이하의 언어 중 c라는 글자를 포함하는 언어가 하나라도 있는지 여부
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x."c)
                .anyMatch();

    }
}
