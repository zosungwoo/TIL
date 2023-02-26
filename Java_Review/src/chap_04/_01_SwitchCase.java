package chap_04;

public class _01_SwitchCase {
    public static void main(String[] args) {
        int ranking = 4;

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
    }
}
