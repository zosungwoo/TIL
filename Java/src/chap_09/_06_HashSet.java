package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수: " + set.size());

        for (String s :
                set) {
            System.out.println(s);  // 순서 보장 X
        }
        System.out.println("---------------");

        // 확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("-----------------");

        // 삭제
        set.remove("삼겹살");
        System.out.println(set.size());

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("집으로 출발");
        }

        // 순서 보장을 원한다면
        HashSet<Integer> intSet = new LinkedHashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (int i :
                intSet) {
            System.out.println(i);
        }
    }
}
