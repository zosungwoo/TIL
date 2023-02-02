package chap_06;

public class _04_Overloading {
    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    // 메소드 오버로딩. 매개변수(Parameter)의 개수나 자료형이 다르면 같은 이름의 메소드를 중복하여 선언할 수 있음
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("3"));
    }
}
