package org.example.linkedlist;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample12 {
    public static List<Email> getArrayList() throws IOException {  // App13 수정
        List<Email> data = new ArrayList<>();

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
//            data.add(new Email(from, to));
            data.add(0, new Email(from, to));
        }
        br.close();
        return data;
    }
    public static List<Email> getLinkedList() throws IOException {  // App13 수정
        List<Email> data = new LinkedList<>();

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
//            data.add(new Email(from, to));
            data.add(0, new Email(from, to));
        }
        br.close();
        return data;
    }
    public static void main(String[] args) throws IOException {
        // 위를 보면 add를 앞에다가 하는데, 이를 통해 array가 삽입할 때 매우 느리다라는 걸 알 수 있음
        // (본 예시를 극단적으로 add를 0 위치에 함. 일반적인 상황에서도 array는 공간 확장 시 모든 데이터를 복사해야하므로 더 느림. linkedlist는 붙이기만 하면 됨)
        long p1 = System.currentTimeMillis();
        List<Email> array = getArrayList();
        System.out.println("ArrayList: " + (System.currentTimeMillis()-p1));
        long p2 = System.currentTimeMillis();
        List<Email> link = getLinkedList();
        System.out.println("LinkedList: " + (System.currentTimeMillis()-p2));
    }
}