package org.example.homework_4;

import org.example.homework_4.lists.GbArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GbList<Integer> list = new GbArrayList<>();
        list.add(5);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.add(9);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.add(66);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.add(8);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.add(5);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.add(9);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.add(66);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.add(8);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.add(5);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.add(9);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.add(66);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.add(8);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        System.out.println("size: = " + list.size());
        System.out.println(list);
        list.removeByIndex(1);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        list.remove(66);
        System.out.println("size: = " + list.size());
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
        System.out.println(list);
        list.add(89);
        list.remove(66);
        System.out.println(list);
        System.out.println("capacity: = " + ((GbArrayList)list).capacity);
//        GbList<String> s = new GbArrayList<>();
//        s.add("asdf");
//        s.add("xcdf");
//        s.add("hjdf");
//        s.add("lkjf");



    }
}
