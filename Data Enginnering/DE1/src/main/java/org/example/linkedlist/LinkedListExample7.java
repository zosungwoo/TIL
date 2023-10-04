package org.example.linkedlist;

import java.util.*;

public class LinkedListExample7 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(5);
        linkedList.add(9);
        linkedList.add(1);

        System.out.println(linkedList);

        for (Object val :
                linkedList.toArray()) {
            System.out.println(val);
        }


        linkedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2)
                    return -1;
                else if (o1 == o2)
                    return 0;
                else
                    return 1;
            }
        });

        System.out.println(linkedList);

        System.out.println(linkedList.subList(1, 3));  // ArrayList는 RandomAccess를 구현하여 subList 만드는 방식이 약간 다름 (얘는 RandomAccess X)

        linkedList.clear();
        System.out.println(linkedList);
    }
}
