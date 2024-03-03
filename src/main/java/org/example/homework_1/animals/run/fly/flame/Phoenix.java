package org.example.homework_1.animals.run.fly.flame;

import org.example.homework_1.animals.Animal;
import org.example.homework_1.animals.run.Owner;

import java.time.LocalDate;

public class Phoenix extends Animal {
    public Phoenix(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void fly() {
        System.out.println(getType() + " not fly");
    }
}
