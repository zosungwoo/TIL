package chap_09;

import java.util.ArrayList;
import java.util.Iterator;

public class _QUIZ_ {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));

        // 방법 1
        for (Student s :
                list) {
            if(s.getCert().equals("자바"))
                System.out.println(s.getName());
        }

        // 방법 2
        Iterator<Student> iter = list.iterator();
        while (iter.hasNext()) {
            Student s = iter.next();
            if(s.getCert().equals("자바"))
                System.out.println(s.getName());
        }
    }
}

class Student{
    private String name;
    private String cert;

    public Student(String name, String cert) {
        this.name = name;
        this.cert = cert;
    }

    public String getName() {
        return name;
    }

    public String getCert() {
        return cert;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }
}
