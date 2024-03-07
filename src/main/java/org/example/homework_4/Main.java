package org.example.homework_4;

import org.example.homework_4.lists.GbArrayList;
import org.example.homework_4.lists.GbLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GbList<Integer> listLinked = new GbLinkedList<>();
        listLinked.add(12);
        listLinked.add(55);
        listLinked.add(88);
        System.out.println(listLinked);
        for (Integer integer : listLinked) {
            System.out.println(integer);
        }

        System.out.println(listLinked.size());

        System.out.println("-----------------------------------");

        for (int i = 0; i < listLinked.size(); i++) {
            System.out.println(listLinked.get(i));
        }


        listLinked.add(1, 99);
        System.out.println(listLinked);
        for (Integer integer : listLinked) {
            System.out.println(integer);
        }

        listLinked.add(4, 100);
        System.out.println(listLinked);
        for (Integer integer : listLinked) {
            System.out.println(integer);
        }


        List<Integer> arrayList = new LinkedList<>();


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
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        System.out.println(list);
        list.add(89);
        list.remove(66);
        System.out.println(list);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);



    }
}
