package org.example.treeset;

import org.example.basic.Email;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample5 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        System.out.println(set);

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();

        Iterator<Integer> dIter = set.descendingIterator();
        while (dIter.hasNext()) {
            System.out.println(dIter.next());
        }
        System.out.println();

        TreeSet<NewEmail2> emailSet = new TreeSet<>();  // NewEmail2
        emailSet.add(new NewEmail2(1, 3));
        emailSet.add(new NewEmail2(2, 4));
        emailSet.add(new NewEmail2(3, 5));
        System.out.println(emailSet);

        TreeSet<Email> emailSet2 = new TreeSet<>(new Comparator<Email>() {  // Email을 Comparator 활용하여 가능하도록
            @Override
            public int compare(Email o1, Email o2) {
                if(o1.getFrom() < o2.getFrom())
                    return -1;
                else if (o1.getFrom() == o2.getFrom())
                    return 0;
                else
                    return +1;
            }
        });
        emailSet2.add(new Email(1, 3));
        emailSet2.add(new Email(2, 4));
        emailSet2.add(new Email(3, 5));
        System.out.println(emailSet);
    }
}
