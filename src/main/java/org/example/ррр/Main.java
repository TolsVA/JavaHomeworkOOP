package org.example.ррр;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s = IntStream.range(1, 6).boxed().collect(Collectors.<Integer>toSet());
        System.out.println(s);
    }
}
