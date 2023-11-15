package org.example.hashset;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashSetExample5 {
    public static HashSet<Integer> getHastSetID() throws IOException {  // App13 수정
        HashSet<Integer> data = new HashSet<>();

        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Data Engineering (Java)/src/main/java/org/example/data/email.txt"));
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
            if(!data.contains(from))
                data.add(from);
            if(!data.contains(to))
                data.add(to);
        }
        br.close();
        return data;
    }
    public static ArrayList<Integer> getArrayListID() throws IOException {  // App13 수정
        ArrayList<Integer> data = new ArrayList<>();

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
            if(!data.contains(from))
                data.add(from);
            if(!data.contains(to))
                data.add(to);
        }
        br.close();
        return data;
    }
    public static LinkedList<Integer> getLinkedListID() throws IOException {  // App13 수정
        LinkedList<Integer> data = new LinkedList<>();

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
            if(!data.contains(from))
                data.add(from);
            if(!data.contains(to))
                data.add(to);
        }
        br.close();
        return data;
    }
    public static void main(String[] args) throws IOException {
        long p1 = System.currentTimeMillis();
        getHastSetID();
        System.out.println("HashSet: " + (System.currentTimeMillis() - p1));
        long p2 = System.currentTimeMillis();
        getArrayListID();
        System.out.println("ArrayList: " + (System.currentTimeMillis() - p2));
        long p3 = System.currentTimeMillis();
        getLinkedListID();
        System.out.println("LinkedList: " + (System.currentTimeMillis() - p3));

        // HashSet: 214ms  -> 고유의 Hashcode를 이용해 중복이 있는지 빠르게 알 수 있음
        // ArrayList: 207542ms
        // ArrayList: 1236694ms

    }
}
