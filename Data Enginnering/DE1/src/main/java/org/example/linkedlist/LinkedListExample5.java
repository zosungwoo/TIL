package org.example.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample5 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);
        List<Integer> arrayList = new ArrayList<>(linkedList);

        System.out.println(linkedList);
        System.out.println(arrayList);

        linkedList.set(2,4);
        arrayList.set(2,4);

        System.out.println(linkedList);  // 0부터 검색
        System.out.println(arrayList);  // 바로 참조(빠름)

        System.out.println(linkedList.remove(Integer.valueOf(4)));  // 값으로 지우기
        System.out.println(arrayList.remove(Integer.valueOf(4)));  // 구현 큰 차이 없음 (둘다 검색)

        System.out.println(linkedList);
        System.out.println(arrayList);

        System.out.println(linkedList.remove(3));  // 0부터 검색, 지운 후에는 연결을 약간만 변경
        System.out.println(arrayList.remove(3));  // 값 찾기는 빠르지만, 앞으로 끌어와야함

        System.out.println(linkedList);
        System.out.println(arrayList);
    }
}
