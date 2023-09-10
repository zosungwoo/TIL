package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App9 {

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

        Integer[] senders = new Integer[300000];
        for(Email email: data){
            int from = email.from;
            for(int i = 0; i < senders.length; i++){
                if(senders[i] == null) {
                    // from이 senders의 null에 도달할때까지 같은게 없었다면 해당 값이 없는 것이므로 추가
                    senders[i] = from;
                    break;
                }
                if(from == senders[i])
                    break;
            }
        }

        int senderCount = 0;
        for(int i=0; i<senders.length; i++)
        {
            if(senders[i] == null)
                break;
            senderCount++;
        }
        System.out.println(senderCount);
    }
}