package org.example.class12_1.philosopher;

import org.example.class12_1.philosopher.DiningTable;

public class Philosopher extends Thread{
    // 0,1,2,3,4
    private int number;
    private DiningTable table;

    public Philosopher(int number, DiningTable table) {
        this.number = number;
        this.table = table;
    }

    @Override
    public void run() {
        while(true){
            try {
                // pick
                // left acquire 시도
                if (number == 0) {
                    table.fork4.acquire();
                }else if(number == 1){
                    table.fork0.acquire();
                }else if(number == 2){
                    table.fork1.acquire();
                }else if(number == 3){
                    table.fork2.acquire();
                }else{
                    table.fork3.acquire();
                }
                // right acquire 시도
                if (number == 0) {
                    table.fork0.acquire();
                }else if(number == 1){
                    table.fork1.acquire();
                }else if(number == 2){
                    table.fork2.acquire();
                }else if(number == 3){
                    table.fork3.acquire();
                }else{
                    table.fork4.acquire();
                }
                // eat
                System.out.println("EAT " + number);
                // return
                if(number == 0){
                    table.fork4.release();
                    table.fork0.release();
                }else if(number == 1){
                    table.fork0.release();
                    table.fork1.release();
                }else if(number == 2){
                    table.fork1.release();
                    table.fork2.release();
                }else if(number == 3){
                    table.fork2.release();
                    table.fork3.release();
                }else if(number == 4){
                    table.fork3.release();
                    table.fork4.release();
                }
                // thick
                System.out.println("THINK");

            } catch (Exception e){

            }
        }
    }
}
