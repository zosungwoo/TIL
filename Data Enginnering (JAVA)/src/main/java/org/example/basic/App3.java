package org.example.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Data Enginnering/DE1/src/main/java/org/example/data/email.txt"));
        int eventCount = 0;
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            if (line.startsWith("#"))
                continue;
            eventCount++;
            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
        }
        System.out.println("이벤트 수: " + eventCount);
        br.close();
    }
}