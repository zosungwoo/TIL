package chap_10;

import java.util.ArrayList;

public class _QUIZ_10 {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("챈들러", 50));
        customers.add(new Customer("레이첼", 42));
        customers.add(new Customer("모니카", 21));
        customers.add(new Customer("벤자민", 18));
        customers.add(new Customer("제임스", 5));

        System.out.println("미술관 입장료");
        System.out.println("----------------");
        customers.stream()
                .map(x -> x.getAge() >= 20 ? x.getName() + " 5000원" : x.getName() + " 무료")
                .forEach(System.out::println);
//        customers.stream().filter(x -> x.getAge() >= 20).map(x -> x.getName() + " 5000원").forEach(System.out::println);
//        customers.stream().filter(x -> x.getAge() < 20).map(x -> x.getName() + " 무료").forEach(System.out::println);
    }
}

class Customer{
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}