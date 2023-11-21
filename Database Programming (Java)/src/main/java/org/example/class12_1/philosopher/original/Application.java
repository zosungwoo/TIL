package org.example.class12_1.philosopher.original;

public class Application {


  public static void main(String[] args) {
     DiningTable table = new DiningTable();
     Philosopher p0 = new Philosopher(0,table);
     Thread t0 = new Thread(p0);
     t0.start();
     Philosopher p1 = new Philosopher(1,table);
     Thread t1 = new Thread(p1);
     t1.start();
     Philosopher p2 = new Philosopher(2,table);
     Thread t2 = new Thread(p2);
     t2.start();
     Philosopher p3 = new Philosopher(3,table);
     Thread t3 = new Thread(p3);
     t3.start();
     Philosopher p4 = new Philosopher(4,table);
     Thread t4 = new Thread(p4);
     t4.start();
  }


}
