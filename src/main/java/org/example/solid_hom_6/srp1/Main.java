package org.example.solid_hom_6.srp1;

import org.example.solid_hom_6.srp1.figure.Point;
import org.example.solid_hom_6.srp1.figure.Square;
import org.example.solid_hom_6.srp1.figure.SquarePrint;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        SquarePrint squarePrint = new SquarePrint();
        squarePrint.draw(square);
    }
}
