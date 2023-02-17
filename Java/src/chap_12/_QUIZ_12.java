package chap_12;

public class _QUIZ_12 {
    public static void main(String[] args) {
        Runnable a = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("A 상품 준비 " + i + "/5");
                }
                System.out.println("-- A 상품 준비 완료 --");
            }
        };

        Runnable b = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("B 상품 준비 " + i + "/5");
                }
                System.out.println("-- B 상품 준비 완료 --");
            }
        };
        Runnable set = new Runnable() {
            @Override
            public void run() {
                System.out.println("== 세트 상품 포장 시작 ==");
                for (int i = 1; i <= 5; i++) {
                    System.out.println("세트 상품 포장 " + i + "/5");
                }
            }
        };

        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);
        Thread threadSet = new Thread(set);
        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        threadSet.start();
    }
}
