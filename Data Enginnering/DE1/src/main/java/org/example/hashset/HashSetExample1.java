package org.example.hashset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<Integer> intHashSet= new HashSet<>();
//        Collection<Integer> intHashSet= new HashSet<>(); 도 가능
        System.out.println(intHashSet);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        System.out.println(arrayList);
        HashSet<Integer> intHashSet2 = new HashSet<>(arrayList);
        System.out.println(intHashSet2);   // 순서는 보장 X
    }
}
