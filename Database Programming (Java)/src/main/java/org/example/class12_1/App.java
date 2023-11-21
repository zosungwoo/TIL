package org.example.class12_1;

import java.util.concurrent.Semaphore;

public class App {
    public static int counter = 0;
    static Semaphore sem = new Semaphore(1);  // 1개라 뮤텍스와 같음
    public static void main(String[] args) throws InterruptedException {
        new IncreaseThread().start();
        new IncreaseThread().start();
        new IncreaseThread().start();
        new IncreaseThread().start();

        Thread.sleep(1000);
        System.out.println(counter);
    }
}
