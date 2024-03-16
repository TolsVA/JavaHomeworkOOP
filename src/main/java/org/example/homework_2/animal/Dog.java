package org.example.homework_2.animal;

public class Dog extends Animal implements Swim, Run{
    private Person owner;
    private static final double MAX_RUN = 15.0;
    private static final double MAX_SWIM = 3.0;

    private Dog(Builder builder) {
        super(builder);
        this.owner = builder.owner;
    }
    public static class Builder extends Animal.Builder<Builder>{
        private Person owner;

        public Builder owner(Person owner) {
            this.owner = owner;
            return self();
        }
        @Override
        public Dog build() {
            return new Dog(this);
        }

        @Override
        protected Builder self() {
            return this;
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

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Собака: " + super.toString() + " Хозяин " + owner;
    }
}
