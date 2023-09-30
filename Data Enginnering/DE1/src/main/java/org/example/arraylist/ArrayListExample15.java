package org.example.arraylist;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayListExample15 {

    public static ArrayList<Email> getData() throws IOException {  // App13 수정
        ArrayList<Email> data = new ArrayList<>();

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
            data.add(new Email(from, to));
//            data[index++] = new Email(from, to);
        }
        br.close();
        return data;
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Email> data = getData();
        // 이벤트의 수
        // 최소 사람의 ID
        // 최대 사람의 ID
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Email email :
                data) {
            int from = email.getFrom();
            int to = email.getTo();
            count++;
            if(from < min)
                min = from;
            if(to < min)
                min = to;
            if(from > max)
                max = from;
            if(to > max)
                max = to;
        }
        System.out.println("이벤트 수: " + count);
        System.out.println("최소 사람 ID: " + min);
        System.out.println("최대 사람 ID: " + max);

    }
}