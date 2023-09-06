package org.example;

public class Email {
    // 데이터 추상화
    int from;
    int to;

    // 프로시저 추상화

    public Email(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return from + " -> " + to;
    }
}
