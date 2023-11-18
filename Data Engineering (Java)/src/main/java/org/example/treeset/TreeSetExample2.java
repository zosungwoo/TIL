package org.example.treeset;

import org.example.basic.Email;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println();

        set.add(3);
        set.add(5);
        set.add(1);

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains(3));
        System.out.println(set.contains(4));
        System.out.println();

        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println();

        TreeSet<NewEmail2> emailTreeSet = new TreeSet<>();  // not comparable -> comparable 구현했음
        emailTreeSet.add(new NewEmail2(1, 3));
        emailTreeSet.add(new NewEmail2(2, 4));
        emailTreeSet.add(new NewEmail2(3, 5));
        System.out.println(emailTreeSet);
    }
}
