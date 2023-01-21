package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees2 = {"아메리카노", "카메모카", "라떼", "카푸치노"};

        // 커피 주문 (배열 순회)
        for (int i = 0; i < coffees2.length; i++) {
            System.out.println(coffees2[i] + " 하나");
        }
        System.out.println("주세요");

        // enhanced for (for-each) 반복문
        for (String coffee : coffees2) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");

    }
}
