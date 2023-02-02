package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        String[][] seats = new String[][]{
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3"}
        };

        String[][] seats2 = {
                {"A1", "A2"},
                {"B1", "B2", "B3"}
        };
        System.out.println(seats2[1][2]);

        // 순회
        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.println(seats2[i][j]);
            }
        }

        for (String[] seatArr: seats2) {
            for (String seat: seatArr) {
                System.out.println(seat);
            }
        }

        // 10*15 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j+1);
            }
        }

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
