package org.example.linkedlist;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample13 {
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
            data.add(new Email(from, to));
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
            data.add(new Email(from, to));
        }
        br.close();
        return data;
    }
    public static void main(String[] args) throws IOException {
        List<Email> array = getArrayList();
        List<Email> link = getLinkedList();

        long p1 = System.currentTimeMillis();
        int from = 0;
        for (Email email :
                array) {
            from += email.getFrom();
        }
        System.out.println(System.currentTimeMillis()-p1);

        long p2 = System.currentTimeMillis();
        from = 0;
        for (Email email:
             link) {
            from += email.getFrom();
        }
        System.out.println(System.currentTimeMillis() - p2);

        long p3 = System.currentTimeMillis();
        from = 0;
        for (int i = 0; i < array.size(); i++) {
            from += array.get(i).getFrom();
        }
        System.out.println(System.currentTimeMillis()-p3);

        long p4 = System.currentTimeMillis();
        from = 0;
        for (int i = 0; i < link.size(); i++) {
            from += link.get(i).getFrom();  // 맨 앞에서 맨 뒤까지 순회해야하므로 오래 걸림 (따라서 절대 인덱스로 순회하면 안됨!!!!!)
        }
        System.out.println(System.currentTimeMillis()-p4);
        // get -> node 구현을 보면 앞 절반까지는 앞에서부터 찾고, 뒤 절반까지는 뒤에서부터 찾아서, 점점 느려지다가 210000쯤부터는 420000까지 다시 빨라짐

    }
}