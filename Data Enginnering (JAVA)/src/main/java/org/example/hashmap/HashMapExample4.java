package org.example.hashmap;

import org.example.basic.Email;

import java.util.HashMap;

public class HashMapExample4 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(2,5);
        System.out.println(map);
        System.out.println();

        HashMap<NewEmail, Integer> map3 = new HashMap<>();
        map3.put(new NewEmail(1, 2), 3);
        map3.put(new NewEmail(2, 4), 5);
        map3.put(new NewEmail(1, 2), 7);
        System.out.println(map3);
        System.out.println();

        HashMap<Integer, Integer> map4 = new HashMap<>(map);
        System.out.println(map4);

        HashMap<Object, Object> map5 = new HashMap<>(map3);
        System.out.println(map5);
        System.out.println();

//        map3 = new HashMap<Email, Integer>(map5); -> 반대는 불가능!!
    }
}
