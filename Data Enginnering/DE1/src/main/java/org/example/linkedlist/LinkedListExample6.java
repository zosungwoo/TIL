package org.example.linkedlist;

import java.util.*;

public class LinkedListExample6 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Integer val :  // Iterator 구현되어 foreach 사용 가능
                linkedList) {
            System.out.println(val);
        }
        System.out.println();

        ListIterator<Integer> listIterator = linkedList.listIterator(3);
        // 위 인덱스 지정해주는 부분에서 arraylist의 listiterator에 비해 비용 더 소모 (인덱스에 해당하는 노드를 찾아야 함)

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
