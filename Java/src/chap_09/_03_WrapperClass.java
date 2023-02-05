package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        Integer i = 123;
        Double d = 3.14;
        Character c = 'a';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("---------------");

        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println("---------------");

        String s = i.toString();
        System.out.println(s);
    }
}
