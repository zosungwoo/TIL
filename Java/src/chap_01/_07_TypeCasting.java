package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환

        // int to float, double
        int score = 93;
        System.out.println(score);  // 93
        System.out.println((float)score);  // 93.0
        System.out.println((double)score);  // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f);  // 93
        System.out.println((int)score_d);  // 98

        // 정수 + 실수 연산
        score = 93 + (int)98.8;
         System.out.println(score);  // 191

        score_d = 93 + 98.8;  // 93은 자동으로 double로 변환됨
        System.out.println(score_d);  // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score;  // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환이 일어남)

        int convertedScoreInt = (int) score_d;  // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)


        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        System.out.println(s2);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

//        int error = Integer.parseInt("자바");
    }
}
