package org.example.class10_2;

import java.io.*;
import java.nio.ByteBuffer;

public class P2Test {

    public static int getOffset(RandomAccessFile raf, int key) throws IOException {

        int offset = 0;

        while(true){
            raf.seek(offset);
            byte[] data = new byte[10];
            raf.read(data);
            int tk = ByteBuffer.wrap(data).getInt();
            if(tk == key)
                return offset;
            else if(tk < key)
                offset = offset * 2 + 20;
            else
                offset = offset * 2 + 10;
        }





//        for (int i = 0; ; i+=10) {
//            raf.seek(i);
//            byte[] data = new byte[10];
//            raf.read(data);
//
//            if (ByteBuffer.wrap(data).getInt() == value)
//                return i;
//        }
//        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("/Users/sungwoo/Desktop/TIL/Database Programming/src/main/java/org/example/class10_2/tree.txt"));

        byte[] b = ByteBuffer.allocate(10).putInt(8).array();
        os.write(b);
        os.write(ByteBuffer.allocate(10).putInt(3).array());
        os.write(ByteBuffer.allocate(10).putInt(10).array());
        os.write(ByteBuffer.allocate(10).putInt(1).array());
        os.write(ByteBuffer.allocate(10).putInt(6).array());
        os.write(ByteBuffer.allocate(10).putInt(-1).array());
        os.write(ByteBuffer.allocate(10).putInt(14).array());
        os.write(ByteBuffer.allocate(10).putInt(-1).array());
        os.write(ByteBuffer.allocate(10).putInt(-1).array());
        os.write(ByteBuffer.allocate(10).putInt(4).array());
        os.write(ByteBuffer.allocate(10).putInt(7).array());
        os.write(ByteBuffer.allocate(10).putInt(-1).array());
        os.write(ByteBuffer.allocate(10).putInt(-1).array());
        os.write(ByteBuffer.allocate(10).putInt(13).array());
        os.write(ByteBuffer.allocate(10).putInt(-1).array());

        os.close();

        ///////////////////////////////////////

        RandomAccessFile raf = new RandomAccessFile("/Users/sungwoo/Desktop/TIL/Database Programming/src/main/java/org/example/class10_2/tree.txt", "r");
        raf.seek(40);
        byte[] data = new byte[10];
        raf.read(data);
        raf.close();

        int result = ByteBuffer.wrap(data).getInt();
        System.out.println(result);
        System.out.println();

        ///////////////////////////////

        raf = new RandomAccessFile("/Users/sungwoo/Desktop/TIL/Database Programming/src/main/java/org/example/class10_2/tree.txt", "r");
        System.out.println(getOffset(raf, 8));
        System.out.println(getOffset(raf, 3));
        System.out.println(getOffset(raf, 10));
        System.out.println(getOffset(raf, 13));
        raf.close();
    }
}
