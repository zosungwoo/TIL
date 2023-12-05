package org.example.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.UnaryOperator;

public class LambdaExample4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2)
                    return -1;
                else if(o1 == o2)
                    return 0;
                else
                    return 1;
            }
        });
        System.out.println(list);

        // 람다 표현식
        list.sort((o1, o2) -> {
            if(o1 < o2)
                return -1;
            else if(o1 == o2)
                return 0;
            else
                return 1;
        });
        System.out.println(list);
    }
}
