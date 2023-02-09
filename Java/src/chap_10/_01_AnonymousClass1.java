package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        Coffee c2 = new Coffee();
        c2.order("카페라떼");
        System.out.println("-----------------");

        // 친한 친구 방문
        Coffee specialCoffee = new Coffee(){  // specialCoffee 객체만을 위한 일회성의 클래스
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("딸기 케이크는 서비스입니다");
            }

            @Override
            public void returnTray() {
                super.returnTray();
                System.out.println("자리에 두시면 제가 지우겠습니다");
            }
        };
        specialCoffee.order("바닐라라떼");
        specialCoffee.returnTray();

    }
}

class Coffee{
    public void order(String coffee){
        System.out.println("주문하신 " + coffee + " 나왓습니다");
    }

    public void returnTray() {
        System.out.println("커피 반납이 완료되었습니다.");
    }
}