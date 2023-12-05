package org.example.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaExample3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer+1;
            }
        });
        System.out.println(list);

        // 람다 표현식
        list.replaceAll(t -> t+1);
        System.out.println(list);
    }
}
