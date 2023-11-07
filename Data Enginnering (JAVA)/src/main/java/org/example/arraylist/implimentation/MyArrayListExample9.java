package org.example.arraylist.implimentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayListExample9 {
    public static void main(String[] args) {
        List<Integer> list = new MyArrayList<Integer>();

        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        // iterator가 구현되어 있어야 사용 가능
        for (Integer val : list) {
            System.out.println(val);
        }

        // iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
