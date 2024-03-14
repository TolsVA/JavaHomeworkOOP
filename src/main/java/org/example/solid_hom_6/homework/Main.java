package org.example.solid_hom_6.homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Presenter presenter = new Presenter(new SavingUser(), new Report());
        presenter.report(user);
        presenter.save(user);
    }
}