package org.example.arraylist;

import org.example.basic.Email;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        System.out.println(intList.isEmpty());
        System.out.println(intList.size());

        ArrayList<String> stringList = new ArrayList<String>();
        System.out.println(stringList.isEmpty());
        System.out.println(stringList.size());

        ArrayList<Email> emailList = new ArrayList<Email>();
        System.out.println(emailList.isEmpty());
        System.out.println(emailList.size());
    }
}
