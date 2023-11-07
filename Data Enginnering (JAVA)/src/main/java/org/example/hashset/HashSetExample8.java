package org.example.hashset;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HashSetExample8 {
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
    public static void main(String[] args) throws IOException {
        List<Email> data = getArrayList();

        ArrayList<Integer> occurrence = new ArrayList<>();
        for (int i = 0; i < 300000; i++) {
            occurrence.add(0);
        }

        for (Email email:
             data) {
            int from = email.getFrom();
            int to = email.getTo();
            occurrence.set(from, occurrence.get(from)+1);
            occurrence.set(to, occurrence.get(from)+1);
        }

        for (int i = 0; i < occurrence.size(); i++) {
            System.out.println(i + ": " + occurrence.get(i));
        }

//        HashSet<Occurrence> occSet = new HashSet<>();
//        for (Email email: data) {
//            int from = email.getFrom();
//            int to = email.getTo();
//            // occSet에 from이 있다면, 가져와서 count를 1 늘려줌
//            // occSet에 to 있다면, 가져와서 count를 1 늘려줌
//
//            // occSet.get ??
//            // HashSet으로 불가능: 실패
//            // HashSet이 중복되지 않는 키를 잘 유지할 수 잌음에도 불구하고 단순한 문제를 풀 수 없었음
//        }
    }
}
