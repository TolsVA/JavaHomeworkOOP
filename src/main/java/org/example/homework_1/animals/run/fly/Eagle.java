package org.example.homework_1.animals.run.fly;

import org.example.homework_1.animals.Animal;
import org.example.homework_1.animals.run.Owner;

import java.time.LocalDate;

public class Eagle extends Animal {
    public Eagle(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void swim() {
        System.out.println(getType() + " not swim");
    }
}
