package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 (Encapsulation): 클래스의 내부 변수와 메소드를 하나로 패키징
        // 정보은닉 (Information Hiding)

        // private: 해당 클래스 내에서만 접근 가능
        // public: 모든 클래스에서 접근 가능
        // default: (명시되지 않았을 때) 같은 패키지 내에서만 접근 거눙
        // protected: 같은 패키지 내에서, 그리고 다른 패키지인 경우 자식 클래스에에서 접근 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망아";
        b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "블랙";

        // 할인 행사
        b1.setPrice(-5000);
        System.out.println("가격: " + b1.getPrice() + "원");
        // 고객 문의
        System.out.println("해상도: " + b1.resolution);
        System.out.println("-----");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격: " + b2.getPrice() + "원");
        System.out.println("해상도: " + b2.getResolution());

        b2.setPrice(-5000);
    }
}
