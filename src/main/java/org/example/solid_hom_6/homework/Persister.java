package org.example.solid_hom_6.homework;

public class Persister{
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
