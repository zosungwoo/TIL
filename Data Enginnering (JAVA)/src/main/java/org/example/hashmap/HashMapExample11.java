package org.example.hashmap;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HashMapExample11 {
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
    // 보낸 사람들에 대해서, 이메일을 받은 사람에게 이메일을 받은 사람을 유지
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

        HashMap<Integer, HashSet<Integer>> receivers2 = new HashMap<>();
        for (Map.Entry<Integer, HashSet<Integer>> entry : receivers.entrySet()) {
            HashSet<Integer> receiverSet = entry.getValue();
            for (Integer receiver :
                    receiverSet) {
                HashSet<Integer> set = null;
                if(receivers2.containsKey(entry.getKey())) {
                    set = receivers2.get(entry.getKey());
                }else{
                    set = new HashSet<Integer>();
                }
                if (receivers.containsKey(receiver))
                    set.addAll(receivers.get(receiver));
                /* 아래 기존코드(강의에서 설명한 코드)는 receiver 사용 안했던 코드
                if(receivers2.containsKey(entry.getKey())) {
                    set = receivers2.get(entry.getKey());
                }else{
                    set = new HashSet<Integer>();
                }
                set.addAll(receiverSet);
                receivers2.put(entry.getKey(), set);
                */
                receivers2.put(entry.getKey(), set);
            }
        }

        for (Map.Entry<Integer, HashSet<Integer>> entry : receivers2.entrySet()) {
            System.out.println(entry);
        }
    }
}
