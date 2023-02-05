package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("----------------");

        // 맨 앞에 추가
        list.addFirst("서장훈");
        list.addLast("김희철");

        for (String s :
                list) {
            System.out.println(s);
        }
        System.out.println("----------------");

        // 특정 인덱스에 추가
        System.out.println("학생 추가 전: "+list.get(1));
        list.add(1, "김영철");  // ArrayList도 가능
        System.out.println("학생 추가 후: "+list.get(1));
        System.out.println("---------------");

        // 데이터 삭제
        for (String s :
                list) {
            System.out.println(s);
        }
        System.out.println("남은 학생 수 (제외 전): " + list.size());
        list.remove(list.size()-1);
        list.removeFirst();
        list.removeLast();
        System.out.println("남은 학생 수 (제외 휴): " + list.size());
        for (String s :
                list) {
            System.out.println(s);
        }

        // 데이터 변경 (수강권 양도)
        list.set(0, "이수근");
        System.out.println(list.get(0));
        System.out.println("----------------");

        //확인
        System.out.println(list.indexOf("김종국"));
        if(list.contains("김종국"))
            System.out.println("수강신청 성공!");
        System.out.println("---------------");

        // 전체 삭제
        list.clear();
        if(list.isEmpty())
            System.out.println("리스트가 비었습니다.");
        System.out.println("------------");

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 정렬
        Collections.sort(list);
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
