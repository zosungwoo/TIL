package org.example.linkedlist.implimentation;

import java.util.ListIterator;

public class MyLinkedListListIterator<E> implements ListIterator<E> {

    private MyLinkedList<E> data;
    private int cursor;
     private MyNode<E> cursorNode;

    public MyLinkedListListIterator(MyLinkedList<E> data, int index) {  // 예제 11의 속도가 느려 더 효율적인 구현을 위해 수정
        this.data = data;
        this.cursor = index - 1;
        if(cursor == -1) {
            this.cursorNode = new MyNode<E>(null, null, data.getNode(0));
        }else{
            this.cursorNode = data.getNode(cursor);
        }
    }

    @Override
    public boolean hasNext() {
        if(cursor + 1 < data.size())
            return true;
        else
            return false;
    }

    @Override
    public E next() {
        cursorNode = cursorNode.getNext();
        cursor++;
        return cursorNode.getItem();
    }

    @Override
    public boolean hasPrevious() {
        if(cursor >= 0)
            return true;
        return false;
    }

    @Override
    public E previous() {
        E element = cursorNode.getItem();
        cursorNode = cursorNode.getPrev();
        cursor--;
        return element;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(E e) {
        cursorNode.setItem(e);
    }

    @Override
    public void add(E e) {

    }
}
