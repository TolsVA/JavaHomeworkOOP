package org.example.homework_2.animal;

public class Cat extends Animal implements Run {
    private Person owner;
    private static final double MAX_RUN = 5.0;

    private Cat(Builder builder) {
        super(builder);
        this.owner = builder.owner;
    }

    @Override
    public double run(double x) {
        double minRun = Math.min(MAX_RUN, x);
        System.out.println(getName() + " Бежит со скоростью " + minRun + KM);
        return minRun;
    }

    public static class Builder extends Animal.Builder<Builder>{
        private Person owner;

        public Builder owner(Person owner) {
            this.owner = owner;
            return self();
        }
        @Override
        public Cat build() {
            return new Cat(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "КОТ: " + super.toString() + " Хозяин " + owner;
    }
}
