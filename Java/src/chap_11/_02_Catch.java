package chap_11;

import java.lang.reflect.Array;

public class _02_Catch {
    public static void main(String[] args) {
        try {
//            System.out.println(3/0);
//
//            int[] arr = new int[3];
//            arr[5] = 100;

            Object obj = "test";
            System.out.println((int) obj);
        } catch (ArithmeticException e){
            System.out.println("뭔가 잘못 계산을 하셨네요");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스를 잘못 설정했어요");
        } catch (ClassCastException e){
            System.out.println("잘못된 형 변환입니다");
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
