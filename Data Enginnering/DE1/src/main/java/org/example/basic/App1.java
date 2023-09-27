package org.example.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Data Enginnering/DE1/src/main/java/org/example/data/email.txt"));

        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            if (line.startsWith("#"))
                continue;
            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);

//            Email email = new Email(from, to);
//            System.out.println(email.toString());

            System.out.println(new Email(from, to));
        }
    }
}