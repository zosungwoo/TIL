package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 1. 컴파일 오류
//        int i = "문자열";
        // 2. 런타임 오류 (에러 Eroor, 예외 Exception)
//        int[] arr = new int[3];
//        arr[5] = 100;
        // 2-1. 에러 (코드로 해결 불가)
//        S s = new S();
//        s.method();
        // 2-2. 예외 (코드로 해결 가능)
//        S s2 = null;
//        s2.method();

        try {
//            System.out.println(3/0);
//
//            int[] arr = new int[3];
//            arr[5] = 100;

//            Object obj = "test";
//            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}

class S{
    public void method(){
        this.method();
    }
}