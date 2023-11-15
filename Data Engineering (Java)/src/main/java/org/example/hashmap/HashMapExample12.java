package org.example.hashmap;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HashMapExample12 {
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
    // 받은 사람들에 대해서, 이메일을 보낸 사람들 구하기
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

        System.out.println("receivers 생성 완료");

        HashMap<Integer, HashSet<Integer>> senders = new HashMap<>();

        for (Map.Entry<Integer, HashSet<Integer>> entry : receivers.entrySet()) {
            int from = entry.getKey();
            HashSet<Integer> toSet = entry.getValue();
            for (Integer to : toSet) {
                HashSet<Integer> set = null;
                if (senders.containsKey(to))
                    set = senders.get(to);
                else
                    set = new HashSet<Integer>();
                set.add(from);
                senders.put(to, set);
            }
        }

        System.out.println("senders 생성 완료");
        for (Map.Entry<Integer, HashSet<Integer>> entry : senders.entrySet()) {
            System.out.println(entry);
        }
        System.out.println(senders.get(131014));
    }
}
