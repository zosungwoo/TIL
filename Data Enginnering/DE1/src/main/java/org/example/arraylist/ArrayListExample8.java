package org.example.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

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
