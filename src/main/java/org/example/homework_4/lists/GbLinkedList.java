package org.example.homework_4.lists;

import org.example.homework_4.GbList;
import org.example.homework_4.lists.util.ArrayIterator;

import java.util.Iterator;

public class GbLinkedList<E> implements GbList<E> {
    // lesson11_2.collections
    private int size;
    private int index;
    private Node<E> head;
    private Node<E> tail;

    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    @Override
    public void add(E value) {
        if (head == null){
            head = new Node<>(null, value, null);
            tail = head;
        } else {
            Node<E> node = new Node<>(head, value, tail);
            tail.next = node;
            head.prev = node;
            node.prev = tail;
            node.next = head;
            tail = node;
        }
        size++;
    }

    @Override
    public void add(int index, E value) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void remove(E value) {

    }


    @Override
    public void removeByIndex(int index) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Iterator<E> iterator() {
        // Здесь масло масленное.
        // Но цель достигнута прикрутил ArrayIterator
        E[] list;
        try {
            list = (E[]) new Object[size];
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
        Iterator<E> iterator = new Iterator<>() {
            private Node<E> node = head;
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                E data = node.data;
                node = node.next;
                index++;
                return data;
            }
        };
        int index = 0;
        while (iterator.hasNext()){
            list[index++] = iterator.next();
        }
        return new ArrayIterator<E>(list);
    }

    @Override
    public String toString() {
        Node<E> node = head;
        StringBuilder str = new StringBuilder();
        str.append("[");
        while (node != null && node.next != head) {
            if (node.next != null) {
                str.append(node.data).append(" <-> ");
            } else {
                str.append(node.data);
            }
            node = node.next;
        }
        str.append(node.data);
        str.append("]");
        return String.valueOf(str);
    }
}
