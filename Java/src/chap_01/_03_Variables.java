package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "조성우";
        int hour = 15;
        System.out.println(name + "님 배송이 시작됩니다. " + hour +"시에 방문 에정입니다.");
        System.out.println(name + "님 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "이준협";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        long  l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
