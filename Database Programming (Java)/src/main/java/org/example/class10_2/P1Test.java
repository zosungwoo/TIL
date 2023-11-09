package org.example.class10_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class P1Test {
    public static void main(String[] args) throws Exception {
        BufferedOutputStream o = new BufferedOutputStream(new FileOutputStream("/Users/sungwoo/Desktop/TIL/Database Programming/src/main/java/org/example/class10_2/test.txt"));

        // "i         L-i       "
        for (int i = 0; i < 10; i++) {
            String data = i + "         " + "L-" + i + "       ";
            byte[] bytes = data.getBytes();
            o.write(bytes);
            o.flush();  // 즉각적으로 파일에 반영
        }
        o.close();

        ////////////////////////////////////////////////////

        BufferedInputStream is = new BufferedInputStream(new FileInputStream("/Users/sungwoo/Desktop/TIL/Database Programming/src/main/java/org/example/class10_2/test.txt"));

        for (int i = 0; i < 10; i++) {
            byte[] data = new byte[20];
            is.read(data);  // 20바이트씩 읽어옴
            String str = new String(data);
            System.out.println(str);
        }
        is.close();
        System.out.println();

        //////////////////////////////////////////////////////

        is = new BufferedInputStream(new FileInputStream("/Users/sungwoo/Desktop/TIL/Database Programming/src/main/java/org/example/class10_2/test.txt"));

        is.skipNBytes(20*5);  // 20바이트 5번 스킵 후
        byte[] data = new byte[20];
        is.read(data);  // 20바이트를 읽어옴
        String str = new String(data);
        System.out.println(str);
        is.close();
    }
}
