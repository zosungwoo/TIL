package org.example.arraylist.implimentation;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
    MyArrayList로 잘 작동하지만, 데이터 추가 및 삭제 시 항상 새로운 공간을 만들어 기존 데이터를 복사하므로 속도가 느려짐
    (capacity(용적)이라는 개념을 활용해 threshold를 넘어가면 capacity를 늘리는 개념으로 속도를 올릴 수 있음. 꽉 찼을때 2배씩만 늘려주는 논리만 추가해도 지금보다 훨씬 빨라짐)
 */


public class MyArrayListExample13 {

    public static List<Email> getData() throws IOException {  // App13 수정
        List<Email> data = new MyArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Data Enginnering/DE1/src/main/java/org/example/data/email.txt"));
        int index = 0;
        int cnt=0;
        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            if (line.startsWith("#"))
                continue;

            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
            data.add(new Email(from, to));
//            data[index++] = new Email(from, to);
            System.out.println(cnt++);
        }
        br.close();
        return data;
    }
    public static void main(String[] args) throws IOException {
        List<Email> data = getData();
        // 이벤트의 수
        // 최소 사람의 ID
        // 최대 사람의 ID
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Email email :
                data) {
            int from = email.getFrom();
            int to = email.getTo();
            count++;
            if(from < min)
                min = from;
            if(to < min)
                min = to;
            if(from > max)
                max = from;
            if(to > max)
                max = to;
        }
        System.out.println("이벤트 수: " + count);
        System.out.println("최소 사람 ID: " + min);
        System.out.println("최대 사람 ID: " + max);

    }
}