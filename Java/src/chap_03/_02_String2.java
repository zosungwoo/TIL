package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java.";

        // 문자열 변환
        System.out.println(s.replace("like", "love"));
        System.out.println(s.substring(7));  // 인덱스 기준 7부터 시작
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));  // "Java" 시작 위치부터 "." 직전 까지

        // 공백 제거
        s = "   I like Java.  ";
        System.out.println(s.trim());  // 앞뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
