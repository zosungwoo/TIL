package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoanReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Database Programming/DBP/src/main/java/org/example/loan.txt"));
        ArrayList<Loan> loanList = new ArrayList<>();


        while(true){
            String line  = br.readLine();
            if(line == null)
                break;
            String[] arr = line.split(",");
            String lonaNumber = arr[0];
            String branchName = arr[1];
            int amount = Integer.parseInt(arr[2]);

            loanList.add(new Loan(lonaNumber, branchName, amount));
//            System.out.println(lonaNumber + "\t" + branchName + "\t" + amount);
        }

        for (Loan loan :
                loanList) {
            System.out.println(loan.toString());
        }

    }


}
