package org.example.homework_3.pharmacy;

import java.util.*;

public class Medicine implements Iterator<MedicineComponent>, Comparable<Medicine> {
    private final List<MedicineComponent> components;
    private int index;
    private static byte trigger = 2;

    public void resetPointer() {
        this.index = 0;
    }

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    public List<MedicineComponent> getComponents() {
        return components;
    }

    @Override
    public boolean hasNext() {
//        return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedicineComponent next() {
//        return components.iterator().next();
        return components.get(index++);
    }


    @Override
    public String toString() {
        return "Medicine[" +
                "components=" + components +
                ", index=" + index +
                "]\n";
    }

    public static void compareToWeight(List<Medicine> list){
        trigger = -1;
        Collections.sort(list);
        trigger = 2;
    }

    public static void compareToPower(List<Medicine> list){
        trigger = 0;
        Collections.sort(list);
        trigger = 2;
    }

    public static void compareToWeightToPower(List<Medicine> list){
        trigger = 1;
        Collections.sort(list);
        trigger = 2;
    }

    private double sumWeightComponents(List<MedicineComponent> components){
        return components.stream()
                .mapToDouble(MedicineComponent::getWeight)
                .sum();
    }

    private int sumPowerComponents(List<MedicineComponent> components){
        return components.stream()
                .mapToInt(MedicineComponent::getPower)
                .sum();
    }

    @Override
    public int compareTo(Medicine o) {
        switch (trigger){
            case -1 -> {return (int) (sumWeightComponents(components) - sumWeightComponents(o.getComponents()));}
            case 0 -> {return sumPowerComponents(components) - sumPowerComponents(o.getComponents());}
            case 1 -> {return (int) (sumWeightComponents(components) + sumPowerComponents(components) -
                    (int) sumWeightComponents(o.getComponents())) - sumPowerComponents(o.getComponents());}
            default -> {return components.size() - o.components.size();}
        }
    }
}
