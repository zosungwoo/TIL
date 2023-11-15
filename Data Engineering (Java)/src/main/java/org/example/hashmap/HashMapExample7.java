package org.example.hashmap;

import java.util.HashMap;

public class HashMapExample7 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>(1, 0.5f);
        map.put(1, 3);
        map.put(5, 7);
        map.put(3 ,9);

        System.out.println(map);
        System.out.println(map.remove(3));
        System.out.println(map);
        map.remove(2);
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}
