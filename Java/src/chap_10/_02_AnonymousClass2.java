package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("----------------------");

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료: 빵, 치킨패티, 양배추, 딸기잼, 치즈");
            }
        };
    }

    private static HomeMadeBurger getMomMadeBurger() {  // 우리집에서만 만드는, 클래스로 따로 정의하기는 애매한 -> 익명클래스
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료: 빵, 소고기패티, 해시브라운, 양상추, 마요네즈, 피클");
            }
        };
    }
}

abstract class HomeMadeBurger{  // 집집마다 다른 요리
    public abstract void cook();
}