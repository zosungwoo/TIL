package org.example.hashmap;

import java.util.*;

public class HashMapExample8 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(3, 8);
        map.put(5, 6);
        map.put(7 ,4);
        map.put(9, 2);
        System.out.println(map);

//        for(Object o: map) -> 불가능 (iterable 상속하고 있지 X), HashSet은 가능

        // 1. KeySet
//        System.out.println(map.keySet());
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println();

//        for (Integer key : keySet) {
//            System.out.println(key + ": " + map.get(key));
//        }

        // 2. EntrySet
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = entryIterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

//        for (Map.Entry<Integer, Integer> entry:
//             map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

        // 3. values
        System.out.println(map.values());
    }
}
