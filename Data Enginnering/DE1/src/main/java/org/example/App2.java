package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/email.txt"));
        int lineCount = 0;
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            lineCount++;
            if (line.startsWith("#"))
                continue;
            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
        }
        System.out.println("줄 수: " + lineCount);
        br.close();
    }
}