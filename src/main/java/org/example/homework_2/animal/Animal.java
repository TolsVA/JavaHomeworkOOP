package org.example.homework_2.animal;

import java.time.LocalDate;
import java.time.Period;

public abstract class Animal {
    private String name;
    private LocalDate birthDay;
    private String gender;
    private String location;
    private Period age = null;
    protected final static String KM = " км.ч";

    protected abstract static class Builder<T extends Builder<T>> {
        private String name;
        private LocalDate birthDay;
        private String gender;
        private String location;

        public T name(String name) {
            this.name = name;
            return self();
        }

        public T birthDay(LocalDate birthDay) {
            this.birthDay = birthDay;
            return self();
        }

        public T gender(String gender) {
            this.gender = gender;
            return self();
        }

        public T location(String location) {
            this.location = location;
            return self();
        }

        public abstract Animal build();

        protected abstract T self();
    }

    Animal(Builder<?> builder) {
        this.name = builder.name;
        this.birthDay = builder.birthDay;
        this.gender = builder.gender;
        this.location = builder.location;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getGender() {
        return gender;
    }

    public String getLocation() {
        return location;
    }

    public Period getAge() {
        if (birthDay != null) {
            age = Period.between(birthDay, LocalDate.now());
        }
        return age;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", Пол: " + gender +
                ", " + "Возраст: " + ((birthDay != null) ? getAge().getYears() : null)  + " год(лет) " +
                ((birthDay != null) ? getAge().getMonths() : null) + " месяцев(a) и " +
                ((birthDay != null) ? getAge().getDays() : null) + " дня(дней)";
    }
}