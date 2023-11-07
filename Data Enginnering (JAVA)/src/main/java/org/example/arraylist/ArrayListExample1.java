package org.example.arraylist;

import org.example.basic.Email;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        // 기본적으로는 Object 클래스가 제네릭스로 들어감
        ArrayList list = new ArrayList();

        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<Email> emailList = new ArrayList<Email>();
    }
}
