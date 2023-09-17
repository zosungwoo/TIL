package org.example.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class App10 {

    public static Email[] getData() throws IOException {
        Email[] data = new Email[420045];

        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/email.txt"));
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
            data[index++] = new Email(from, to);
        }
        br.close();
        return data;
    }
    public static void main(String[] args) throws IOException {
        Email[] data = getData();

        HashSet<Integer> senders = new HashSet<Integer>();
        for(Email email: data){
            int from = email.from;
            senders.add(from);
        }

        System.out.println(senders.size());
    }
}