package org.example.arraylist;

import org.example.basic.Email;

import java.util.ArrayList;

public class ArrayListExample7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0, 3);
        list.add(1, 5);
        list.add(2, 3);
        list.add(1, 9);

        System.out.println(list);

        list.set(3, 10);
        System.out.println(list);

//        list.set(4, 15); // error


        // remove 메소드는 총 2개 (index로, object로)

//        list.remove(10);  -> out of index error! (Object 클래스를 상속받는 클래스의 인스턴스가 와야 object로 찾을 수 있음)
        list.remove(Integer.valueOf(10));  // 지워지면 true 반환
        System.out.println(list);

          // index로 지우기
        System.out.println(list.remove(0));  // 지워진 값 반환
        System.out.println(list);

        System.out.println(list.remove(Integer.valueOf(50))); // 없으면 false 반환
    }
}
