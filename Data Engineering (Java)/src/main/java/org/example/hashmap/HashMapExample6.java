package org.example.hashmap;

import java.util.HashMap;

public class HashMapExample6 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>(1, 0.5f);
        map.put(1, 3);
        map.put(5, 7);
        map.put(3 ,9);

        System.out.println(map.containsKey(5));  // hash 테이블 접근하므로 아래 value보다 훨씬 효율적
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue(3));
        System.out.println(map.containsValue(4));
        System.out.println();

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(2, 5));  // 키 2가 없다면 디폴트벨류 5 반환
    }
}
