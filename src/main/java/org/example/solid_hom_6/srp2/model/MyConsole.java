package org.example.solid_hom_6.srp2.model;

import java.util.Scanner;

public class MyConsole {
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
