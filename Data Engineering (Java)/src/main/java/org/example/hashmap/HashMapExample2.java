package org.example.hashmap;

import org.example.basic.Email;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println();

        map.put(1, 3);
        map.put(2, 4);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println();

        map.put(1,5);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println();

        map.putIfAbsent(2,1);  // absent가 아니므로 수정되지 않음
        System.out.println(map);
    }
}
