package org.example.hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetExample6 {
    public static HashSet<Integer> getHastSetID() throws IOException {  // App13 수정
        HashSet<Integer> data = new HashSet<>();

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
    public static HashSet<Integer> getHastSetSenderIDs() throws IOException {  // App13 수정
        HashSet<Integer> data = new HashSet<>();

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
            data.add(from);
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
        HashSet<Integer> idSet = getHastSetID();
        HashSet<Integer> senderSet = getHastSetSenderIDs();
        ArrayList<Integer> senderArrayList = new ArrayList<>(senderSet);
        LinkedList<Integer> senderLinkedList = new LinkedList<>(senderSet);

        long p1 = System.currentTimeMillis();
        for (Integer id : idSet) {
            senderSet.contains(id);  // 어떤 아이디를 찾을 때 이것이 효율적인지를 판단하기 위한 예제
        }
        System.out.println("HashSet: " + (System.currentTimeMillis() - p1));

        long p2 = System.currentTimeMillis();
        for (Integer id : idSet) {
            senderArrayList.contains(id);  // 어떤 아이디를 찾을 때 이것이 효율적인지를 판단하기 위한 예제
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - p2));

        long p3 = System.currentTimeMillis();
        for (Integer id : idSet) {
            senderLinkedList.contains(id);  // 어떤 아이디를 찾을 때 이것이 효율적인지를 판단하기 위한 예제
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - p3));

        // HashSet: 95ms  -> 특정 key에 대한 효율적인 탐색이 가능
        // ArrayList: 2260852ms
        // ArrayList: 305073ms

    }
}
