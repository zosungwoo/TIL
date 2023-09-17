package org.example.arraylist;

import org.example.basic.Email;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample14 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        List<Integer> subList = list.subList(2, 4);  // 2부터 3까지
        System.out.println(subList);

        subList.add(1, 9);  // subList로 반환된 리스트는 'view'로서(view collection), 원본 리스트에도 연산이 적용됨
        System.out.println(subList);
        System.out.println(list);

        list.add(10);
        System.out.println(list);
        System.out.println(subList);  // 수정이 일어나서 오류 발생
    }
}
