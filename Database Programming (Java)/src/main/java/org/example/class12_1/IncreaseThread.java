package org.example.class12_1;

public class IncreaseThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10000; i++) {
                App.sem.acquire();
                // CRITICAL SECTION의 시작
                App.counter++;
                // CRITICAL SECTION의 종료
                App.sem.release();
            }
        }catch (Exception e) {

        }
    }
}
