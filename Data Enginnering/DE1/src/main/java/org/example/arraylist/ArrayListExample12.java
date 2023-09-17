package org.example.arraylist;

import java.util.ArrayList;

public class ArrayListExample12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        Integer[] array = new Integer[3];  // 3인데도 되는 이유는, toArray의 구현을 보면 사이즈를 맞게 새로 생성해줌
        array = list.toArray(array);
        for (Integer val :
                array) {
            System.out.println(val);
        }

        Integer[] array2 = new Integer[7];  // 크면 남은 크기는 그대로 남게됨(null)
        array2 = list.toArray(array2);
        for (Integer val :
                array2) {
            System.out.println(val);
        }

        String[] array3 = new String[5];  // String으로 캐스팅 불가! (Object는 가능)
        array3 = list.toArray(array3);
        for (String val :
                array3) {
            System.out.println(val);
        }

    }
}
