package org.example.class12_1.philosopher;

import org.example.class12_1.philosopher.DiningTable;
import org.example.class12_1.philosopher.Philosopher;

public class PhilApp {
    public static void main(String[] args) {
        DiningTable table = new DiningTable();
        new Philosopher(0, table).start();
        new Philosopher(1, table).start();
        new Philosopher(2, table).start();
        new Philosopher(3, table).start();
        new Philosopher(4, table).start();
    }
}
