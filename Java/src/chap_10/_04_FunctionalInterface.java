package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        // 함수형 인터페이스
        KRWConverter converter = new KRWConverter();
//        converter.convert(1);

//        convertUSD(converter, 1);

        // 람다식 사용 1
//        convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD*1400) + "원"), 1);

        // 람다식 사용 2
        Convertible convertible = (USD) -> System.out.println(USD + "달러 = " + (USD*1400) + "원");
        convertUSD(convertible, 1);

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러 = 1400원");
        c1.convert();

        // 두 줄 이상의 코드는?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 = " + (USD*KRW) + "원");
        };
        c1.convert();

        // 전달값이 2개인 경우
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + "달러 = " + (d*w) + "원");
        c2.convert(10, 1400);

        // 반환값이 있는 경우
        ConvertibleWithReturn c3 = (d, w) -> { return d * w; };
        ConvertibleWithReturn c4 = (d, w) -> d * w;  // 같은 표현
        int result = c3.convert(2,1400);
        System.out.println(result);

    }

    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }
}
