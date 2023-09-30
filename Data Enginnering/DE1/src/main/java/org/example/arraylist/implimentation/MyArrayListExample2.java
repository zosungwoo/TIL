package org.example.arraylist.implimentation;

import org.example.basic.Email;

public class MyArrayListExample2 {
    public static void main(String[] args) {
        MyArrayList<Integer> intList = new MyArrayList<Integer>();
        System.out.println(intList.isEmpty());
        System.out.println(intList.size());

        MyArrayList<String> stringList = new MyArrayList<String>();
        System.out.println(stringList.isEmpty());
        System.out.println(stringList.size());

        MyArrayList<Email> emailList = new MyArrayList<Email>();
        System.out.println(emailList.isEmpty());
        System.out.println(emailList.size());
    }
}
