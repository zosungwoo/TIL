package org.example.linkedlist;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListExample9 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        try {
            System.out.println(linkedList.element());  // 오류
            System.out.println("이 문장은 출력되지 않음");
        } catch (NoSuchElementException e) {
            System.out.println("이 문장이 출력됨");
        }
        System.out.println(linkedList.peek());

        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);

        System.out.println(linkedList.element());
        System.out.println(linkedList.peek());
    }
}
