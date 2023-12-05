package org.example.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        // 람다 표현식
        list.forEach(t -> System.out.println(t));
    }
}
