package org.example.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // listIterator: 앞뒤로 가능
        ListIterator<Integer> listIterator = list.listIterator(0);  // 초기 커서가 0-1 = -1부터!
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        ListIterator<Integer> listIterator2 = list.listIterator(list.size());  // 초기 커서가 5-1 = 4부터!
        while (listIterator2.hasPrevious()) {
            System.out.println(listIterator2.previous());
        }
    }
}
