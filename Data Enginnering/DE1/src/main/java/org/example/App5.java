package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/email.txt"));
        int max = Integer.MIN_VALUE;
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            if (line.startsWith("#"))
                continue;

            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);

            if(from > max)
                max = from;
            if(to > max)
                max = to;
        }
        System.out.println("최소 사람 ID: " + max);
        br.close();
    }
}