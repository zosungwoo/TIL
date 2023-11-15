package org.example.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App7 {

    public static void app3(Email[] data) throws IOException {
        int size = 0;
        for(int i=0; i<data.length; i++)
            size++;
        System.out.println("이벤트 수: " + size);

    }
    public static void app4(Email[] data) throws IOException {
        int min = Integer.MAX_VALUE;

        for(Email email: data){
            if(email.from < min)
                min = email.from;
            if(email.to < min)
                min = email.to;
        }
        System.out.println("최소 사람 ID: " + min);
    }
    public static void app5(Email[] data) throws IOException {
        int max = Integer.MIN_VALUE;

        for(Email email: data){
            if(email.from > max)
                max = email.from;
            if(email.to > max)
                max = email.to;
        }
        System.out.println("최대 사람 ID: " + max);
    }
    public static void main(String[] args) throws IOException {
        long pre = System.currentTimeMillis();

        Email[] data = new Email[420045];

        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Data Enginnering/DE1/src/main/java/org/example/data/email.txt"));
        int index = 0;
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            if (line.startsWith("#"))
                continue;

            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
            data[index++] = new Email(from, to);
        }
        br.close();

        app3(data);
        app4(data);
        app5(data);

        System.out.println(System.currentTimeMillis() - pre);
    }
}