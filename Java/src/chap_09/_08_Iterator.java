package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("알수없음");
        list.add("김종국");
        list.add("강호동");
        list.add("알수없음");
        list.add("박명수");
        list.add("조세호");

        for (String s:
            list) {
            System.out.println(s);
        }
        System.out.println("------------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println("----------------");

        it = list.iterator();  // 커서를 처음위치로
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------");

        // 삭제
        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("알수없음")) {
                it.remove();
            }
        }

        it = list.iterator();  // 커서를 처음위치로
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------");


        // 해쉬셋 적용
        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");

        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("----------- ");


        // 해쉬맵 적용
        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator() 없음!!
        Iterator<String> itMapKey = map.keySet().iterator();
        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next() + ": " + itMapValue.next());
        }
        System.out.println("----------- ");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
            //System.out.println(itMap.next().getKey());
        }
    }
}
