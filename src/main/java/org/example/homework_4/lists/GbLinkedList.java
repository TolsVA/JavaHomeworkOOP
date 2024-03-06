package org.example.homework_4.lists;

import org.example.homework_4.GbList;

import java.util.Iterator;

public class GbLinkedList<E> implements GbList<E> {
    // lesson11_2.collections
    private Node<E> head;
    private Node<E> tail;

    public class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data, Node<E> next, Node<E> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    @Override
    public void add(E value) {
        if (head == null){
            head = new Node<>(value,null, null);
            tail = head;
        } else {
            Node<E> node = new Node<>(value, head, tail);
            tail.next = node;
            head.prev = node;
            node.prev = tail;
            node.next = head;
            tail = node;
        }
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
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
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
