package org.example.arraylist.implimentation;

import org.example.basic.Email;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListExample1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        List<String> stringList = new ArrayList<String>();
        List<Email> emailList = new ArrayList<Email>();

        List<Integer> intList2 = new MyArrayList<Integer>();
        List<String> stringList2 = new MyArrayList<String>();
        List<Email> emailList2 = new MyArrayList<Email>();

    }
}
