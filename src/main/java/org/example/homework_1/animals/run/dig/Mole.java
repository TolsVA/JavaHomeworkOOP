package org.example.homework_1.animals.run.dig;

import org.example.homework_1.animals.Animal;
import org.example.homework_1.animals.run.Owner;

import java.time.LocalDate;

public class Mole  extends Animal {
    public Mole(String name, float weight, LocalDate age, Owner owner) {
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
