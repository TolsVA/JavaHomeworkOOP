package org.example.solid_hom_6.homework.sav;

import org.example.solid_hom_6.homework.User;

public class SavingUser implements Savable {
    @Override
    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
