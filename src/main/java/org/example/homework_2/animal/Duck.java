package org.example.homework_2.animal;

public class Duck extends Animal implements Run, Swim,Fly{
    private Person owner;
    private static final double MAX_RUN = 2.0;
    private static final double MAX_SWIM = 8.0;
    private static final double MAX_FLY = 25.0;

    private Duck(Builder builder) {
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
        public Duck build() {
            return new Duck(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    @Override
    public double fly(double x) {
        double minFly = Math.min(MAX_FLY, x);
        System.out.println(getName() + " Летит со скоростью " + minFly + KM);
        return minFly;
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
        return "Утка: " + super.toString() + " Хозяин " + owner;
    }
}
