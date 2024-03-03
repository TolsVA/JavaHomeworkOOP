package org.example.homework_1.animals.run;

import org.example.homework_1.animals.Animal;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void fly() {
        System.out.println(getType() + " not fly");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " not swim");
    }
}
