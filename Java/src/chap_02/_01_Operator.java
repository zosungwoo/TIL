package chap_02;

public class _01_Operator {
    public static void main(String[] args) {
        // 산술 연산자
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(5/2);  // 2
        System.out.println(2/4);  // 0
        System.out.println(4%2);
        System.out.println(5%2);

        // 증감 연산자 ++, --
        int val = 10;
        System.out.println(val);  // 10
        System.out.println(++val);  // 11
        System.out.println(val++);  // 11
        System.out.println(val);  // 12

        // 복합 대입 연산자
        int num = 10;
        num += 2;
        System.out.println(num);
        num *= 2;
        System.out.println(num);

        // 삼항 연산자
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s);
    }
}
