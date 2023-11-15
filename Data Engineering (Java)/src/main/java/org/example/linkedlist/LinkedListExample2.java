package org.example.linkedlist;

import org.example.basic.Email;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        LinkedList<String> stringList = new LinkedList<>();
        LinkedList<Email> emailList = new LinkedList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        System.out.println(arrayList);

        LinkedList<Integer> intList2 = new LinkedList<>(arrayList);  // Collection이기 때문에 가능 (iterator로 복사)
        System.out.println(intList2);
    }
}
