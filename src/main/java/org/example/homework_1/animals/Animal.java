package org.example.homework_1.animals;

import org.example.homework_1.animals.run.Owner;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public void lifeCycle(){
        wakeup(15.35);
        eat();
        play();
        sleep();
    }

    private void wakeup(){
        System.out.println(getType() + " waked up");
    }
    private void wakeup(double time){
        System.out.println(getType() + " waked up at " + time);
    }
    private void eat(){
        System.out.println(getType() + " is eating");
    }
    private void play(){
        System.out.println(getType() + " is playing");
    }
    private void sleep(){
        System.out.println(getType() + " is sleeping");
    }

    public void toGo(){
        System.out.println(getType() + " to go");
    }

    public void fly(){
        System.out.println(getType() + " fly");
    }

    public void swim(){
        System.out.println(getType() + " swim");
    }
    public String getType(){

        return getClass().getSimpleName();
    }
    public String getName() {
        return name;
    }

    private void setWeight(float weight) {
        this.weight = weight;
    }
    private float getWeight() {
        return weight;
    }
    public LocalDate getAge() {
        return age;
    }

    private void setOwner(Owner owner) {
        this.owner = owner;
    }
    private Owner getOwner() {
        return owner;
    }

    public String toString(){
        return String.format("name = %s, weight = %s, age = %s, owner = %s",
                name, weight, age, owner);
    }
}
