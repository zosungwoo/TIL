package org.example.arraylist.implimentation;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListExample11 {
    public static void main(String[] args) {
         List<Integer> list = new MyArrayList<Integer>();

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
