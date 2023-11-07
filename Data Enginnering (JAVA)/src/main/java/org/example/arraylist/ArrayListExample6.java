package org.example.arraylist;

import org.example.basic.Email;

import java.util.ArrayList;

public class ArrayListExample6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0, 3);
        list.add(1, 5);
        list.add(2, 3);
        list.add(1, 9);

        System.out.println(list);
        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(3));

        ArrayList<Email> emails = new ArrayList<Email>();
        emails.add(new Email(0, 1));
        emails.add(new Email(0, 1));
        System.out.println(emails.indexOf(new Email(0, 1)));
        System.out.println(emails.lastIndexOf(new Email(0, 1)));

        // 못찾을 경우 -1 반환
        System.out.println(emails.indexOf(new Email(1, 1)));


    }
}
