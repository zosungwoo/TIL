package org.example.hashmap;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HashMapExample9 {
    public static List<Email> getArrayList() throws IOException {  // App13 수정
        List<Email> data = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Data Enginnering (Java)/src/main/java/org/example/data/email.txt"));
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

        HashMap<Integer, Integer> occurrence = new HashMap<>();
        for (Email email :
                data) {
            int from = email.getFrom();
            int to = email.getTo();
            if (occurrence.containsKey(from)) {
                occurrence.put(from, occurrence.get(from) + 1);
            }else {
                occurrence.put(from, 1);
            }
            if (occurrence.containsKey(to)) {
                occurrence.put(to, occurrence.get(to) + 1);
            }else {
                occurrence.put(to, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : occurrence.entrySet()) {
            System.out.println(entry);
        }
    }
}
