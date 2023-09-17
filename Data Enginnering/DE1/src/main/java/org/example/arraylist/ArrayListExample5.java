package org.example.arraylist;

import org.example.basic.Email;

import java.util.ArrayList;

public class ArrayListExample5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0, 3);
        list.add(1, 5);
        list.add(2, 7);
        list.add(1, 9);

        System.out.println(list);

        Integer val = list.get(1);
        System.out.println(val);

        list.get(4);  // error


    }
}
