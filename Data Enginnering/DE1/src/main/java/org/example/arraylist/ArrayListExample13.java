package org.example.arraylist;

import org.example.basic.Email;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list);

        // comparator interface를 구현한 class의 instance를 이용함 (MyIntegerComparator.java 참고)
        list.sort(new MyIntegerComparator());

        System.out.println(list);

        // 내림차순 -> 익명 클래스로 구현
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2)
                    return 1;
                else if (o1 == o2)
                    return 0;
                else
                    return -1;
            }
        });
        System.out.println(list);


        ArrayList<Email> emails = new ArrayList<>();
        emails.add(new Email(5, 1));
        emails.add(new Email(3, 4));
        emails.add(new Email(2, 2));
        emails.add(new Email(4, 3));
        emails.add(new Email(1, 5));

        System.out.println(emails);
        emails.sort(new Comparator<Email>() {  // 보내는 사람 오름차순
            @Override
            public int compare(Email o1, Email o2) {
                if (o1.getFrom() < o2.getFrom())
                    return -1;
                else if (o1.getFrom() == o2.getFrom())
                    return 0;
                else
                    return 1;
            }
        });
        System.out.println(emails);

        emails.sort(new Comparator<Email>() {  // 받는 사람 내림차순
            @Override
            public int compare(Email o1, Email o2) {
                if (o1.getTo() < o2.getTo())
                    return 1;
                else if (o1.getTo() == o2.getTo())
                    return 0;
                else
                    return -1;
            }
        });
        System.out.println(emails);
    }
}
