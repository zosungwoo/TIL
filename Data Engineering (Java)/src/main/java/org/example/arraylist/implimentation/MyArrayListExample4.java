package org.example.arraylist.implimentation;

import java.util.ArrayList;

public class MyArrayListExample4 {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<Integer>();

        list.add(0, 3);
        list.add(1, 5);
        list.add(2, 7);
        list.add(1, 9);

        System.out.println(list);


    }
}
