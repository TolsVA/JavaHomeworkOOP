package org.example.homework_2.animal;

import org.example.homework_2.MyArrayList;

import java.util.List;

public class Person extends Animal implements Run, Swim{
    private String secondName;
    private String middleName;
    private static final double MAX_RUN = 10.0;
    private static final double MAX_SWIM = 10.0;
    private final List<Animal> pets;
    Person(Builder builder) {
        super(builder);
        this.secondName = builder.secondName;
        this.middleName = builder.middleName;
        this.pets = builder.pets;
        if (!builder.pets.isEmpty() && (builder.pets.getLast() instanceof Cat)) {
                ((Cat) (builder.pets.getLast())).setOwner(this);
        }
    }

    @Override
    public double run(double x) {
        double minRun = Math.min(MAX_RUN, x);
        System.out.println(getName() + " Бежит со скоростью " + minRun + KM);
        return minRun;
    }

    @Override
    public double swim(double x) {
        double minSwim = Math.min(MAX_SWIM, x);
        System.out.println(getName() + " Плывёт со скоростью " + minSwim + KM);
        return minSwim;
    }

    public static class Builder extends Animal.Builder<Builder>{
        private String secondName;
        private String middleName;
        private final List<Animal> pets = new MyArrayList<>();

        public Builder setSecondName(String secondName) {
            this.secondName = secondName;
            return self();
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return self();
        }

        public Builder setPets(Animal animal) {
            pets.add(animal);
            return self();
        }

        @Override
        public Person build() {
            return new Person(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public List<Animal> getPets() {
        return pets;
    }

    public void setPets(Animal animal) {
        this.pets.add(animal);
    }

    @Override
    public String toString() {
        return "Фамилия: " + secondName + ", Отчество: " + middleName + ", " + super.toString();
    }
}
