package org.example.homework_4;

import org.example.homework_4.lists.GbArrayList;
import org.example.homework_4.lists.GbLinkedList;

public class Main {
    public static void main(String[] args) {
        GbList<Integer> linkedList = new GbLinkedList<>();
        linkedList.add(12);
        linkedList.add(55);
        linkedList.add(88);
        System.out.println(linkedList);

        linkedList.add(1, 99);
        System.out.println(linkedList);
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }

        linkedList.add(4, 100);
        System.out.println(linkedList);
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }

        System.out.println("Удаляем 33");
        linkedList.remove(33);
        System.out.println(linkedList);

        System.out.println("Удаляем по индексу за пределами массива 5");
        linkedList.removeByIndex(5);
        System.out.println(linkedList);

        System.out.println("Удаляем 55");
        linkedList.remove(55);
        System.out.println(linkedList);

        System.out.println("Бежим в перёд");
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }

        System.out.println("Бежим в назад");
        for (int i = linkedList.size() - 1; i >= 0 ; i--) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("Получаем элемент по индексу за пределами массива 6");
        var num = linkedList.get(6);
        System.out.println(num);

        System.out.println();
        System.out.println("-----------------new GbArrayList<>()------------------");

        GbList<Integer> list = new GbArrayList<>();
        list.add(5);
        list.add(9);
        list.add(66);
        list.add(8);
        list.add(5);
        list.add(9);
        list.add(66);
        list.add(8);
        list.add(5);
        list.add(9);
        list.add(66);
        list.add(8);
        System.out.println(list);
        list.removeByIndex(1);
        list.remove(66);
        System.out.println("size: = " + list.size());
        System.out.println("capacity: = " + ((GbArrayList<?>)list).getCapacity());
        System.out.println(list);
        list.add(89);
        list.remove(66);
        System.out.println(list);

        System.out.println("Добавление по индексу 3 элемент 100");
        list.add(3, 100);
        System.out.println(list);

    }
}
