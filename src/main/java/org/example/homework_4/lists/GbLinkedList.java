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
        if (index < 0 || index >= size){
            System.out.println("index = " + index + " выходит за пределы коллекции");
            return null;
        }
        return getNode(index).data;
    }

    private Node<E> getNode(int index) {
        Node<E> node = head;
        int count = 0;
        while (count < index) {
            node = node.next;
            count++;
        }
        return node;
    }

    private Node<E> getNode(E value) {
        Node<E> node = head;
        if(value == node.data) return node;
        node = node.next;
        while (value != node.data && node != head) {
            node = node.next;
        }
        if (node.data != value) {
            node = null;
        }
        return node;
    }

    @Override
    public void remove(E value) {
        Node<E> node = getNode(value);
        if (node != null) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        } else System.out.println("Элемент не найден");
    }


    @Override
    public void removeByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("index = " + index + " не входит в пределлы диапазона коллекции");
            return;
        }
        Node<E> node = getNode(index);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public E[] toArray() {
        E[] result;
        try {
            result = (E[]) new Object[size];
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
        Node<E> node = head;
        if (size != 0) {
            result[0] = node.data;
        } else return result;

        int i = 1;
        for (node = node.next; node != head; node = node.next)
            result[i++] = node.data;
        return result;
    }

    @Override
//    @SuppressWarnings("unchecked")
    public Iterator<E> iterator() {
/*        // Здесь масло масленное.
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
        int count = 0;
        while (iterator.hasNext()) {
            list[count++] = iterator.next();
        }
        return new ArrayIterator<>(list);*/
            return new ArrayIterator<>(toArray());
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
        assert node != null;
        str.append(node.data);
        str.append("]");
        return String.valueOf(str);
    }
}
