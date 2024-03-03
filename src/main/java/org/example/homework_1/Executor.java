package org.example.homework_1;

import org.example.homework_1.animals.run.Cat;
import org.example.homework_1.animals.run.Lion;
import org.example.homework_1.animals.run.dig.Mole;
import org.example.homework_1.animals.run.fly.Eagle;
import org.example.homework_1.animals.run.fly.flame.Phoenix;
import org.example.homework_1.animals.run.swim.Crocodile;
import org.example.homework_1.animals.swim.Fish;

import java.time.LocalDate;

public class Executor {
    public void startProgram() {
        Cat cat = new Cat("Васька", 5, LocalDate.of(2019, 2, 23), null);
        cat.fly();
        cat.swim();
        Lion lion = new Lion(null, 5, null, null);
        lion.fly();
        lion.swim();
        Fish fish = new Fish(null, 0, LocalDate.now(), null);
        fish.fly();
        fish.toGo();
        Crocodile crocodile = new Crocodile(null, 16, null, null);
        crocodile.fly();
        Eagle eagle = new Eagle(null, 1, null, null);
        eagle.swim();
        Phoenix phoenix = new Phoenix(null, 1.6f, null, null);
        phoenix.swim();
        Mole mole = new Mole(null, 0.2f, null, null);
        mole.fly();
        mole.swim();
    }
}
