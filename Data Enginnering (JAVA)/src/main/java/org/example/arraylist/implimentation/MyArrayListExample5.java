package org.example.arraylist.implimentation;

import org.example.basic.Email;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListExample5 {
    public static void main(String[] args) {
        List <Integer> list = new MyArrayList<Integer>();

        list.add(0, 3);
        list.add(1, 5);
        list.add(2, 7);
        list.add(1, 9);

        System.out.println(list);
        System.out.println(list.contains(3));
        System.out.println(list.contains(6));


        List<Email> emails = new MyArrayList<Email>();
        emails.add(new Email(0, 0));
        emails.add(new Email(0, 1));
        emails.add(new Email(2, 2));
        System.out.println(emails);

        // 아래 결과는 false가 나오는데, Object 클래스의 equals 메소드에 기반하여 contains가 구현되었기 때문
        // 둘은 같은 객체가 아니므로 false가 반환됨
        System.out.println(emails.contains(new Email(0, 1)));  // Email equals 재정의하여 true 반환됨

        // 방법 1
        Email e01 = new Email(4, 4);
        emails.add(e01);
        System.out.println(emails.contains(e01));

        // 방법 2 (equals 메소드 오버라이딩) -> Email 클래스 참고
        System.out.println(emails.contains(new Email(4, 4)));

        // 원래 ArrayList 결과
//        [3, 9, 5, 7]
//        true
//        false
//                [0 -> 0, 0 -> 1, 2 -> 2]
//        true
//        true
//        true

    }
}
