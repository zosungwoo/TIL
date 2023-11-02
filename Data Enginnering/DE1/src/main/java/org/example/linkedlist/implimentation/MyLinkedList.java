package org.example.linkedlist.implimentation;

import java.util.*;

public class MyLinkedList<E> implements List<E>, Queue<E> {

    private MyNode<E> first;
    private MyNode<E> last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public MyLinkedList(Collection<? extends E> c) {
        this();
        for (E value :
                c) {
            add(value);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if(size == 0)
            return false;
        MyNode<E> cursor = first;
        do {
            if (cursor.getItem().equals(o)) {
                return true;
            }
            cursor = cursor.getNext();
        }while(cursor != null);
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListListIterator<E>(this, 0);
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int idx = 0;
        for (E val :
                this) {
            array[idx++] = val;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (first == null) {
            MyNode<E> newNode = new MyNode<>(null, e, null);
            first = newNode;
            last = newNode;
            size++;
        } else {
            MyNode<E> newNode = new MyNode<>(last, e, null);
            last.setNext(newNode);
            last = newNode;
            size++;
        }
        return true;
    }

    @Override
    public boolean offer(E e) {
        if (first == null) {
            MyNode<E> newNode = new MyNode<>(null, e, null);
            first = newNode;
            last = newNode;
            size++;
        } else {
            MyNode<E> newNode = new MyNode<>(last, e, null);
            last.setNext(newNode);
            last = newNode;
            size++;
        }
        return true;
    }

    @Override
    public E remove() {
        if(size == 0){
            throw new NoSuchElementException();
        }else{
            return remove(0);
        }
    }

    @Override
    public E poll() {
        if(size == 0){
            return null;
        }else{
            return remove(0);
        }
    }

    @Override
    public E element() {
        if (size == 0) {
            throw new NoSuchElementException();
        } else {
            return get(0);
        }
    }

    @Override
    public E peek() {
        if (size == 0) {
            return null;
        } else {
            return get(0);
        }
    }

    @Override
    public boolean remove(Object o) {
        MyNode<E> nodeToRemove = getNode(o);

        if (nodeToRemove == null) {
            return false;
        }

        MyNode<E> next = nodeToRemove.getNext();
        MyNode<E> prev = nodeToRemove.getPrev();

        if(prev == null) {
            // nodeToRemove가 first
            first = next;
        }else {
            prev.setNext(next);
        }

        if (next == null) {
            // nodeToRemove가 last
            last = prev;
        } else {
            next.setPrev(next);
        }
        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        while (size != 0) {
            remove(0);
        }
    }

    @Override
    public E get(int index) {
        if(index >= size  || index < 0)
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);

        int cIdx = 0;
        MyNode<E> cursor = first;
        do {
            if (cIdx == index) {
                return cursor.getItem();
            }
            cursor = cursor.getNext();
            cIdx++;
        }while(cursor != null);

        return null;
    }

    public MyNode<E> getNode(int index) {
        if(index >= size  || index < 0)
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);

        int cIdx = 0;
        MyNode<E> cursor = first;
        do {
            if (cIdx == index) {
                return cursor;
            }
            cursor = cursor.getNext();
            cIdx++;
        }while(cursor != null);

        return null;
    }

    private MyNode<E> getNode(Object o) {
        int cIdx = 0;
        MyNode<E> cursor = first;
        do {
            if (cursor.getItem().equals(o)) {
                return cursor;
            }
            cursor = cursor.getNext();
            cIdx++;
        }while(cursor != null);

        return null;


    }

    @Override
    public E set(int index, E element) {
        MyNode<E> node = getNode(index);
        E previousOne = node.getItem();
        node.setItem(element);
        return previousOne;
    }

    @Override
    public void add(int index, E element) {
        if(index > size || index < 0)
            throw new IndexOutOfBoundsException();

        if (size == index) {
            // 가장 마지막에 추가
            add(element);
        }else {
            // 중간에 추가
            MyNode<E> next = getNode(index);
            MyNode<E> prev = next.getPrev();
            // 새로운 노드 추가
            MyNode<E> newNode = new MyNode<E>(prev, element, next);
            // prev에 대한 참조 재조정
            if (prev != null) {
                // 처음 위치에 추가하는 것이 아님
                prev.setNext(newNode);
            } else {
                first = newNode;
            }
            next.setPrev(newNode);
        }
        size++;
    }

    @Override
    public E remove(int index) {
        MyNode<E> nodeToRemove = getNode(index);
        E element = nodeToRemove.getItem();
        MyNode<E> next = nodeToRemove.getNext();
        MyNode<E> prev = nodeToRemove.getPrev();

        if(prev == null) {
            // nodeToRemove가 first
            first = next;
        }else {
            prev.setNext(next);
        }

        if (next == null) {
            // nodeToRemove가 last
            last = prev;
        } else {
            next.setPrev(prev);
        }
        size--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        if (size == 0)
            return -1;
        int cIdx = 0;
        MyNode<E> cursor = first;
        do {
            if (cursor.getItem().equals(o)) {
                return cIdx;
            }
            cursor = cursor.getNext();
            cIdx++;
        }while(cursor != null);


        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int cIdx = size-1;
        MyNode<E> cursor = last;
        do {
            if (cursor.getItem().equals(o)) {
                return cIdx;
            }
            cursor = cursor.getPrev();
            cIdx--;
        }while(cursor != null);


        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new MyLinkedListListIterator<E>(this, 0);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return new MyLinkedListListIterator<E>(this, index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        String result = "[";
        result += first.getItem();
        MyNode<E> cursor = first.getNext();
        while(cursor != null)
        {
            result += "," + cursor.getItem();
            cursor = cursor.getNext();
        }
        result += "]";
        return result;
    }
}
