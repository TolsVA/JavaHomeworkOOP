package org.example.solid_hom_6.homework.report;

import org.example.solid_hom_6.homework.User;

public class Report implements Reportable {
    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
