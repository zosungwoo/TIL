package org.example.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App6 {

    public static void app2() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Data Enginnering/DE1/src/main/java/org/example/data/email.txt"));
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
    public static void app3() throws IOException {
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
    public static void app4() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Data Enginnering/DE1/src/main/java/org/example/data/email.txt"));
        int min = Integer.MAX_VALUE;
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            if (line.startsWith("#"))
                continue;

            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);

            if(from < min)
                min = from;
            if(to < min)
                min = to;
        }
        System.out.println("최소 사람 ID: " + min);
        br.close();
    }
    public static void app5() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Data Enginnering/DE1/src/main/java/org/example/data/email.txt"));
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

            if (from > max)
                max = from;
            if (to > max)
                max = to;
        }
        System.out.println("최소 사람 ID: " + max);
        br.close();
    }




    public static void main(String[] args) throws IOException {
        long pre = System.currentTimeMillis();

//        app2();
        app3();
        app4();
        app5();

        System.out.println(System.currentTimeMillis() - pre);
    }
}