package org.example.arraylist;

import java.util.Comparator;

public class MyIntegerComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {  // o1이 작을때 음수, 같으면 0, 크면 양수
        if (o1 < o2)
            return -1;
        else if (o1 == o2)
            return 0;
        else
            return 1;
    }
}
