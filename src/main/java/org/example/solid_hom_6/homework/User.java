package org.example.solid_hom_6.homework;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void save(){
        Persister persister = new Persister(this);
        persister.save();
    }

    public void report(){
        System.out.println("Report for user: " + name);
    }
}
