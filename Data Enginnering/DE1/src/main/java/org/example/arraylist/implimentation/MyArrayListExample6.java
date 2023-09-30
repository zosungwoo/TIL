package org.example.arraylist.implimentation;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListExample6 {
    public static void main(String[] args) {
        List<Integer> list = new MyArrayList<Integer>();

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
