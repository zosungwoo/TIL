package org.example.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
}
