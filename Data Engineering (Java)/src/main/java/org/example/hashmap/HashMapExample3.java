package org.example.hashmap;

import org.example.basic.Email;

import java.util.HashMap;

public class HashMapExample3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(2,5);
        System.out.println(map);
        System.out.println();

        HashMap<Email, Integer> map2 = new HashMap<>();
        map2.put(new Email(1, 2), 3);
        map2.put(new Email(2, 4), 5);
        System.out.println(map2);
        map2.put(new Email(1, 2), 7);
        System.out.println(map2);  // 중복된 값이 삽입되었네?! -> 주소 비교를 하게 되어서 그럼
        System.out.println();

        // equals, hashCode 오버라이딩 (둘다 필수)
        HashMap<NewEmail, Integer> map3 = new HashMap<>();
        map3.put(new NewEmail(1, 2), 3);
        map3.put(new NewEmail(2, 4), 5);
        System.out.println(map3);
        map3.put(new NewEmail(1, 2), 7);
        System.out.println(map3);
        System.out.println();
    }
}
