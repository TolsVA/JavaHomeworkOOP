package org.example.solid_hom_6.ocp1;

import org.example.solid_hom_6.ocp1.shape.Shape;
import org.example.solid_hom_6.ocp1.shape.impl.RightTriangle;
import org.example.solid_hom_6.ocp1.shape.impl.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> figures = new ArrayList<>();
        figures.add(new RightTriangle(2, 3));
        figures.add(new Square(4));
        double sumArea = 0;
        for (Shape shape : figures) {
            sumArea += shape.square();
        }

        System.out.printf("Sum of areas equals %f \n", sumArea);
    }
}
