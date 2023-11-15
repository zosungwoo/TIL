package org.example.hashset;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample9 {
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

        ArrayList<HashSet<Integer>> receivers = new ArrayList<HashSet<Integer>>();
        for (int i = 0; i < 265214; i++) {
            receivers.add(new HashSet<Integer>());
        }

        for (Email email:
             data) {
            int from = email.getFrom();
            int to = email.getTo();

            // receivers의 form index의 hashSet에 to를 추가
            HashSet<Integer> current = receivers.get(from);
            current.add(to);
            receivers.set(from, current);
        }

        for (int i = 0; i < receivers.size(); i++) {
            System.out.println(i + ": " + receivers.get(i));
        }

    }
}
