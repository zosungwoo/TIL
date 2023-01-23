package chap_04;

public class _02_For_While {
    public static void main(String[] args) {
        // For 반복문
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While 반복문
        int distance = 25;
        int move = 0;
        while (move < 25) {
            System.out.println("현재 이동 거리" + move);
            move += 3;
        }
        System.out.println("도착!");


        // 오른쪽 별 찍기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
