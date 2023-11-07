package org.example.hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetExample7 {
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
    public static HashSet<Integer> getHastSetReceiverIDs() throws IOException {  // App13 수정
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
            data.add(to);
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
        HashSet<Integer> senderSet = getHastSetSenderIDs();
        HashSet<Integer> receiverSet = getHastSetReceiverIDs();

        System.out.println("보낸 사람 수: " + senderSet.size());
        System.out.println("받는 사람 수: " + receiverSet.size());

        senderSet.addAll(receiverSet);
        System.out.println("이메일 네트워크에 참여한 사람 수: " + senderSet.size());

//        senderSet.retainAll(receiverSet);
//        System.out.println("이메일을 보내기도 하고 받기도 한 사람 수: " + senderSet.size());

//        senderSet.removeAll(receiverSet);
//        System.out.println("이메일을 보내기만 한 사람 수: " + senderSet.size());

    }
}
