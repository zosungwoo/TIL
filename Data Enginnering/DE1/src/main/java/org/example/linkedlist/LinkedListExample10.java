package org.example.linkedlist;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListExample10 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // 추출!
        try {
            System.out.println(linkedList.remove());  // 오류
            System.out.println("이 문장은 출력되지 않음");
        } catch (NoSuchElementException e) {
            System.out.println("이 문장이 출력됨");
        }
        System.out.println(linkedList.poll());

        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);

        System.out.println(linkedList.remove());
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
    }
}
