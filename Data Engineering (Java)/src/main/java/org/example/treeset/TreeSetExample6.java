package org.example.treeset;

import org.example.basic.Email;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample6 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);

        for (Integer val :
                set) {
            System.out.println(val);
        }
        System.out.println();

        for (Integer val:
             set.descendingSet()) {
            System.out.println(val);
        }
        System.out.println();

        System.out.println(set.subSet(3, true, 9, true));  // 포함 여부를 bool로
        System.out.println(set.subSet(3, false, 9, false));

    }
}
