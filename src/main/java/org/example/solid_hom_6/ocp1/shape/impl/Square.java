package org.example.solid_hom_6.ocp1.shape.impl;


import org.example.solid_hom_6.ocp1.shape.Shape;

public class Square  implements Shape {
    private final int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
