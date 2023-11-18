package org.example.treeset;

import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);

        System.out.println(set);
        System.out.println();

        System.out.println(set.lower(5));  // 직접값(미만)
        System.out.println(set.floor(5));  // 이하
        System.out.println(set.floor(6));
        System.out.println();

        System.out.println(set.higher(5));  // 직후값
        System.out.println(set.ceiling(5));  // 이상
        System.out.println();

        System.out.println(set.first());
        System.out.println(set.last());
    }
}
