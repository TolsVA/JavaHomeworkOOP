package org.example.homework_2.animal;

public class Fish extends Animal implements Swim{
    private Person owner;
    private static final double MAX_SWIM = 15.0;
    private Fish(Builder builder) {
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
        public Fish build() {
            return new Fish(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
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
        return "Рыбка: " + super.toString() + " Хозяин " + owner;
    }
}
