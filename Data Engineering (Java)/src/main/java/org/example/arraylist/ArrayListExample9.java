package org.example.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            // 짝수일 때
            if (val % 2 == 0)
                iterator.remove();
//                list.remove(val);  // 원래 데이터의 변형이 생겨 오류가 남
        }
        System.out.println(list);


    }
}
