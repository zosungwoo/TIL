package org.example.lambda;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class LambdaExample6 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);

        // key value의 리맵핑
        map.compute(3, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer k, Integer v) {
                System.out.println("이전: " + k + "=" + v);
                return 7;
            }
        });
        System.out.println(map);

        map.compute(5, (k, v) -> 9);
        System.out.println(map);
    }
}
