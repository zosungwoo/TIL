package chap_04;

public class _02_For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int distance = 25;
        int move = 0;
        while (move < 25) {
            System.out.println("현재 이동 거리" + move);
            move += 3;
        }
        System.out.println("도착!");
        //
    }
}
