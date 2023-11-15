package org.example.hashmap;

import java.util.HashMap;

public class HashMapExample5 {
    public static void main(String[] args) {
        // initial capacity 설정 -> loadFactor에 의해 늘어나긴 함 (bucket 수를 결정하는 값 초깃값: 0.75)
        HashMap<Integer, Integer> map = new HashMap<>(1, 0.5f);  // 절반 차면 확장
        for (int i = 0; i < 1000; i++) {
            map.put(i,i);
        }
        System.out.println(map);
    }
}
