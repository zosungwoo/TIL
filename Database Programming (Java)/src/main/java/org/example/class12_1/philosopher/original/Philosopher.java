package org.example.class12_1.philosopher.original;

public class Philosopher implements Runnable {


   private DiningTable table;
   private int pid;
   private String indentation;


   public Philosopher(int pid, DiningTable table) {
       this.pid = pid;
       this.table = table;
       indentation = "";
       for (int i = 0; i < pid; i++) {
           indentation += "\t\t";
       }
   }


   @Override
   public void run() {
       while (true) {
           // deadlock
           // Pick
           System.out.println(indentation + "TRY LEFT PICK");
           table.getLeftFork(pid);
           System.out.println(indentation + "TRY RIGHT PICK");
           table.getRightFork(pid);
           System.out.println(indentation + "PICK");
           // Eat
           System.out.println(indentation + "EAT");
           table.returnLeftFork(pid);
           table.returnRightFork(pid);
           System.out.println(indentation + "RETURN");
          //  Think
           System.out.println(indentation + "THINK");


           // resolving deadlock
           // Pick
//            System.out.println(indentation + "TRY PICK");
//            if (pid == 4) {
//                table.getRightFork(pid);
//                table.getLeftFork(pid);
//            } else {
//                table.getLeftFork(pid);
//                table.getRightFork(pid);
//            }
//            System.out.println(indentation + "PICK");
//            // Eat
//            System.out.println(indentation + "EAT");
//            if (pid == 4) {
//                table.returnRightFork(pid);
//                table.returnLeftFork(pid);
//            } else {
//                table.returnLeftFork(pid);
//                table.returnRightFork(pid);
//            }
//            System.out.println(indentation + "RETURN");
//            // Think
//            System.out.println(indentation + "THINK");
       }
   }


}
