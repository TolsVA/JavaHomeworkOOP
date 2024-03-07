package org.example.homework_4.lists;

import org.example.homework_4.GbList;
import org.example.homework_4.lists.util.ArrayIterator;

import java.util.Iterator;

public class GbLinkedList<E> implements GbList<E> {
    private int size;
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
    public boolean isEmpty() {
        return head != null;
    }

    @Override
    public void add(E value) {
        if (!isEmpty()) {
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
        if (index > size) return;

        Node<E> node = getNode(index);
        Node<E> newNode = new Node<>(node.prev, value, node);
        node.prev.next = newNode;
        node.prev = newNode;
        size++;
    }

    public E get(int index) {
        return getNode(index).data;
    }

    private Node<E> getNode(int index) {
        Node<E> node = head;
        int caunt = 0;
        while (caunt < index) {
            node = node.next;
            caunt++;
        }
        return node;
    }

    private Node<E> getNode(E value) {
        Node<E> node = head;
        if(value == node.data) return node;
        node = node.next;
        int caunt = 0;
        while (value != node.data && node != head) {
            node = node.next;
            caunt++;
        }

        return node;
    }

    @Override
    public void remove(E value) {
        Node<E> node = head;
        if(value == node.data);
        node = node.next;
        int caunt = 0;
        while (value != node.data && node != head) {
            node = node.next;
            caunt++;
        }
    }


    @Override
    public void removeByIndex(int index) {

    }

//    public void removeKeyAll(T key) {
//        Node<T> find = head;
//        while (find != null) {
//            while (find.data != key) {
//                find = find.next;
//                if (find == null)
//                    return;
//            }
//
//            if (find == head)
//                removeFirst();
//            else
//                find.prev.next = find.next;
//
//            if (find == tail)
//                removeLast();
//            else
//                find.next.prev = find.prev;
//
//            find = find.next;
//        }
//    }
//
//    public void removeIndex(int index) {
//        Node<T> find = head;
//        int c = 0;
//        while (find != null && c != index) {
//            find = find.next;
//            c++;
//        }
//
//        if (find == head)
//            removeFirst();
//        else
//            find.prev.next = find.next;
//
//        if (find == tail)
//            removeLast();
//        else
//            find.next.prev = find.prev;
//
//    }

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
                return this.index < size;
            }

            @Override
            public E next() {
                E data = node.data;
                node = node.next;
                this.index++;
                return data;
            }
        };
        int caunt = 0;
        while (iterator.hasNext()) {
            list[caunt++] = iterator.next();
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
