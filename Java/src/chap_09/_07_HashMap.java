package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);

        System.out.println("총 고객 수: " + map.size());
        System.out.println("------------------");

        // 조회
        System.out.println("유재석님의 포인트: " + map.get("유재석"));
        System.out.println("박명수님의 포인트: " + map.get("박명수"));



    }
}
