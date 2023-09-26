package org.example.week3_1;

import java.util.HashSet;
import java.util.Iterator;

public class App2 {
    public static void main(String[] args) {
        HashSet<Integer> x = new HashSet<>();
        x.add(3);
        x.add(1);
        x.add(8);

        Iterator<Integer> iter = x.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Integer v = iter.next();
            sum += v;
        }
        System.out.println(sum);



    }


}
