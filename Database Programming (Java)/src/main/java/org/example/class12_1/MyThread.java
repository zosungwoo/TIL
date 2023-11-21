package org.example.class12_1;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello, thread");
        System.out.println("Hello, thread2");
    }
}
