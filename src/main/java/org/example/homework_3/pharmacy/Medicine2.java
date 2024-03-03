package org.example.homework_3.pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine2 implements Iterable<MedicineComponent> {
    private final List<MedicineComponent> components;
    private int index;

    public Medicine2() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine2 addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    public List<MedicineComponent> getComponents() {
        return components;
    }

    public void resetPointer() {
        this.index = 0;
    }

    @Override
    public String toString() {
        return "Medicine2{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }

    @Override
    public Iterator<MedicineComponent> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedicineComponent next() {
                return components.get(index++);
            }
        };
    }
}
