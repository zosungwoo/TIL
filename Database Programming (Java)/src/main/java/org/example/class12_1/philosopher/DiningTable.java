package org.example.class12_1.philosopher;

import java.util.concurrent.Semaphore;

public class DiningTable {
    public Semaphore fork0;
    public Semaphore fork1;
    public Semaphore fork2;
    public Semaphore fork3;
    public Semaphore fork4;

    public DiningTable() {
        fork0 = new Semaphore(1);
        fork1 = new Semaphore(1);
        fork2 = new Semaphore(1);
        fork3 = new Semaphore(1);
        fork4 = new Semaphore(1);
    }
}
