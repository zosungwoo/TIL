package org.example.treeset;

import java.util.EnumMap;

public class NewEmail2 implements Comparable<NewEmail2> {
    // 데이터 추상화
    int from;
    int to;

    // 프로시저 추상화

    public NewEmail2(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return from + " -> " + to;
    }

    @Override
    public boolean equals(Object obj) {
        NewEmail2 objEmail = (NewEmail2) obj;

        if(from == objEmail.from && to == objEmail.to)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return from + to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }


    @Override
    public int compareTo(NewEmail2 o) {
        if(from < o.from)
            return -1;
        else if (from == o.from)
            return 0;
        else
            return +1;
//        Returns a negative integer, zero, or a positive integer as this object
//        is less than, equal to, or greater than the specified object
    }
}
