package org.example.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App8 {

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

        // 265213 ID가 있는지 확인
        for(Email email: data){
            if(email.from == 265213){
                System.out.println("발견");
                System.exit(1);
            }
            if (email.to == 265213) {
                System.out.println("발견");
                System.exit(1);
            }
        }
        System.out.println("미발견");
    }
}