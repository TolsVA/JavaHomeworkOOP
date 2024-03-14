package org.example.solid_hom_6.homework;

import org.example.solid_hom_6.homework.report.Report;
import org.example.solid_hom_6.homework.sav.SavingUser;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Presenter presenter = new Presenter(new SavingUser(), new Report());
        presenter.report(user);
        presenter.save(user);
    }
}