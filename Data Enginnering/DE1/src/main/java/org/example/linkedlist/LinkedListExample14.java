package org.example.linkedlist;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample14 {
    public static ArrayList<Email> getArrayList() throws IOException {  // App13 수정
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
        }
        br.close();
        return data;
    }
    public static LinkedList<Email> getLinkedList() throws IOException {  // App13 수정
        LinkedList<Email> data = new LinkedList<>();

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
        }
        br.close();
        return data;
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Email> array = getArrayList();
        LinkedList<Email> link = getLinkedList();  // 이번엔 LinkedList로 받아주게 함수를 수정 (그래야 poll 사용 가능) ArrayList도 마찬가지

        long p1 = System.currentTimeMillis();
        while (true) {
            if (array.size() > 0) {
                array.remove(0);
            } else {
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - p1);  // 처음에 느렸다가 점점 빨라짐 (뒤의 데이터를 앞으로 shift 해줘야함)

        long p2 = System.currentTimeMillis();
        while (true) {
            Email email = link.poll();
            if(email == null)
                break;
        }
        System.out.println(System.currentTimeMillis() - p2);


        ArrayList<Email> array2 = getArrayList();
        long p3 = System.currentTimeMillis();
        while (true) {
            if (array2.size() > 0) {
                array2.remove(array2.size()-1);
            } else {
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - p3);
        // 스택으로서의 구현으로 shift가 일어나지 않음. but 메모리 효율 측면에서는 비효율적임. 기존 공간이 아예 사라지는 것이 아닌 null로 채워지기 때문
        // (Email 객체에서 null 담는 공간으로 변했기 때문에 GC가 약간 공간을 확보해주긴 함)

    }
}