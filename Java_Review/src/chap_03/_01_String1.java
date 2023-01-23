package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java.";
        System.out.println(s);

        // 문자열 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("java"));
        System.out.println(s.indexOf("Java"));  // 처음 일치하는 위치 정보
        System.out.println(s.indexOf("C#"));
        System.out.println(s.lastIndexOf("a"));  // 마지막 일치하는 위치 정보
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("."));
    }
}
