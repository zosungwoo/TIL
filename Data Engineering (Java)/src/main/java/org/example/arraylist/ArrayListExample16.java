package org.example.arraylist;

import org.example.basic.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample16 {

    public static ArrayList<Email> getData() throws IOException {  // App13 수정
        ArrayList<Email> data = new ArrayList<>();

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
            data.add(new Email(from, to));
//            data[index++] = new Email(from, to);
        }
        br.close();
        return data;
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Email> data = getData();

        // 보내는 사람 기준 오름차순
        data.sort(new Comparator<Email>() {
            @Override
            public int compare(Email o1, Email o2) {
                if (o1.getFrom() < o2.getFrom())
                    return -1;
                else if (o1.getFrom() == o2.getFrom())
                    return 0;
                else
                    return 1;
            }
        });

        Iterator<Email> iterator = data.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 받는 사람 기준 내림차순 + 역순회
        data.sort(new Comparator<Email>() {
            @Override
            public int compare(Email o1, Email o2) {
                if (o1.getTo() < o2.getTo())
                    return 1;
                else if (o1.getTo() == o2.getTo())
                    return 0;
                else
                    return -1;
            }
        });

        ListIterator<Email> emailListIterator = data.listIterator(data.size());
        while (emailListIterator.hasPrevious()) {
            System.out.println(emailListIterator.previous());
        }
    }
}