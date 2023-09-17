package org.example.arraylist;

import org.example.basic.Email;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(3);  // 면화가 일어나면 True 반환

        // Collection에서 상속된 메소드가 아닌 List에서 생성된 메소드
        intList.add(1, 4);
        intList.add(0, 2);
        System.out.println(intList);

        intList.add(4, 5);  // 에러!

    }
}
