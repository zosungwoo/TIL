package org.example.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);
        System.out.println(linkedList);
        List<Integer> arrayList = new ArrayList<>(linkedList);

        System.out.println(linkedList.contains(5));
        System.out.println(arrayList.contains(5));  // 거의 같은 방식의 구현

        System.out.println(linkedList.get(4));  // 0~4까지 요소를 참조로 계속 확인함
        System.out.println(arrayList.get(4));  // 인덱스 4 바로 참조

        System.out.println(linkedList.indexOf(5));
        System.out.println(arrayList.lastIndexOf(5));
        System.out.println(linkedList.indexOf(5));
        System.out.println(arrayList.lastIndexOf(5));  // 큰 차이 없는 방


    }
}
