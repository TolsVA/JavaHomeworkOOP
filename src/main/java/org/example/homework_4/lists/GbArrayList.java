package org.example.homework_4.lists;

import org.example.homework_4.GbList;
import org.example.homework_4.lists.util.ArrayIterator;

import java.util.Iterator;

public class GbArrayList<E> implements GbList<E> {
    public E[] values;
    private int size;
    public int capacity;

    public int getCapacity() {
        return capacity;
    }

    @SuppressWarnings("unchecked")
    public GbArrayList() {
        this.size = 0; // Сколько элементов внутри присутствует
        this.capacity = 10; // Сколько всего возможно элементов
        try {
            this.values = (E[]) new Object[capacity];
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void addCapacity() {
        capacity = capacity + capacity / 2;
        E[] array = null;
        try {
            array = (E[]) new Object[capacity];
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        System.arraycopy(values, 0, array, 0, values.length);
        this.values = array;
    }

    @Override
    public void add(E value) {
        if (size == capacity) {
            addCapacity();
        }
        values[size++] = value;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void add(int index, E value) {
        if (size == capacity) {
            addCapacity();
        }
        E[] tempDonor = values;
        try {
            values = (E[]) new Object[capacity];
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        System.arraycopy(tempDonor, 0, values, 0, index);
        values[index++] = value;
        System.arraycopy(tempDonor, --index, values, ++index, tempDonor.length - index - 1);
        size++;
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public void remove(E value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(value)) {
                removeByIndex(i);
                return;
            }
        }
        throw new RuntimeException("Element was not found.");
    }

    @Override
    @SuppressWarnings("unchecked")
    public void removeByIndex(int index) {
        try {
            E[] tempDonor = values;
            values = (E[]) new Object[tempDonor.length - 1];
            System.arraycopy(tempDonor, 0, values, 0, index);
            System.arraycopy(tempDonor, index + 1, values, index, tempDonor.length - index - 1);
            size--;
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int i = 0;
        while (values[i] != null) {
            builder.append(values[i]).append(", ");
            i++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
