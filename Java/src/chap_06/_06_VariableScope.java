package chap_06;

public class _06_VariableScope {
    public static void methodA(){
//        System.out.println(number);
    }

    public static void methodB(){
        int result = 1;
    }
    public static void main(String[] args) {
        int number = 3;

//        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

//        System.out.println(i);
    }
}
