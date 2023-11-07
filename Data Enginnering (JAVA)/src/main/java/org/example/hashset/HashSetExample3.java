package org.example.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample3 {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<Integer>();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());  // hashset은 순서가 없음!
        }
        set.clear();
        System.out.println(set);

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
        System.out.println(set);

        Integer[] array = new Integer[10];
        array = set.toArray(array);  // 이렇게 크기를 작게 만들어도 알아서 늘려서 넣어줌!!!
        for (Integer val :
                array) {
            System.out.print(val + ",");
        }
    }
}
