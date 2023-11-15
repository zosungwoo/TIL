package org.example.hashmap;

public class NewEmail {
    // 데이터 추상화
    int from;
    int to;

    // 프로시저 추상화

    public NewEmail(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return from + " -> " + to;
    }

    @Override
    public boolean equals(Object obj) {
        NewEmail objEmail = (NewEmail) obj;

        if(from == objEmail.from && to == objEmail.to)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return from + to;  // hash table의 주소를 나타냄 (단순히 1이라고 써도 작동하나 이는 해쉬테이블을 링크드리스트로 만드는 것과 같은 의미없는 짓)
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
}
