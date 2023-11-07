package org.example.linkedlist;

import org.example.basic.Email;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());

        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());

        linkedList.add(1, 9);  // index를 가지고 있지 않아 찾아야 하지만, 뒤로 밀 필요 X
        arrayList.add(1, 9);  // 첫번쨰 이후의 인덱스 요소들을 뒤로 밀고 9를 삽입
        System.out.println(linkedList);
        System.out.println(arrayList);
    }
}
