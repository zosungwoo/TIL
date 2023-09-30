package org.example.arraylist.implimentation;

import java.util.ArrayList;

public class MyArrayListExample3 {
    public static void main(String[] args) {
        MyArrayList<Integer> intList = new MyArrayList<Integer>();

        intList.add(1);
        System.out.println(intList.add(3));
        System.out.println(intList.size());
        System.out.println(intList.isEmpty());


    }
}
