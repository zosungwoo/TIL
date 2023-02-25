package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value) -> 중복 X, 순서 보장 X
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("총 고객 수: " + map.size());
        System.out.println("------------------");

        // 조회
        System.out.println("유재석님의 포인트: " + map.get("유재석"));
        System.out.println("박명수님의 포인트: " + map.get("박명수"));
        System.out.println("-------------------");

        // 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈님의 누적포인트는 " + point);
        }else {
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규등록 (포인트1)");
        }
        System.out.println("------------------_");

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));
        System.out.println("----------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수:" + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("---------------");

        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        // Key 확인
        for (String key:
            map.keySet()) {
            System.out.println(key);
        }
        System.out.println("----------------");

        // Value 확인
        for (int value :
                map.values()) {
            System.out.println(value);
        }

        // 순서를 보장하고 싶다면
        HashMap<String, Integer> map2 = new LinkedHashMap<>();

    }
}
