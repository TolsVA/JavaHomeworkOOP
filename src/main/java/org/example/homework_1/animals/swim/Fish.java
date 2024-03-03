package org.example.homework_1.animals.swim;

import org.example.homework_1.animals.Animal;
import org.example.homework_1.animals.run.Owner;

import java.time.LocalDate;

public class Fish extends Animal {
    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " not to go");
    }

    @Override
    public void fly() {
        System.out.println(getType() + " not fly");
    }
}
