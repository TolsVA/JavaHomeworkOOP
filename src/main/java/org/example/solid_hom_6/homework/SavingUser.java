package org.example.solid_hom_6.homework;
public class SavingUser implements Savable {
    @Override
    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
