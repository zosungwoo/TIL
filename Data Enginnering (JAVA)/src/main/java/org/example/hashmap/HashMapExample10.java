package org.example.hashmap;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HashMapExample10 {
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

        HashMap<Integer, HashSet<Integer>> receivers = new HashMap<>();
        for (Email email :
                data) {
            int from = email.getFrom();
            int to = email.getTo();
            HashSet<Integer> set = null;
            if (receivers.containsKey(from)) {
                set = receivers.get(from);
            }else {
                set = new HashSet<Integer>();
            }
            set.add(to);
            receivers.put(from, set);
        }

        for (Map.Entry<Integer, HashSet<Integer>> entry : receivers.entrySet()) {
            System.out.println(entry);
        }
    }
}
