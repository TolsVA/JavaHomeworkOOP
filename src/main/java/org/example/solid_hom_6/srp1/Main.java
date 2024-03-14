package org.example.solid_hom_6.srp1;

import org.example.solid_hom_6.srp1.figure.*;
import org.example.solid_hom_6.srp1.figure.rectang.Rectangl;
import org.example.solid_hom_6.srp1.figure.rectang.RectanglPrinter;
import org.example.solid_hom_6.srp1.figure.squar.Square;
import org.example.solid_hom_6.srp1.figure.squar.SquarePrint;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        SquarePrint squarePrint = new SquarePrint();
        squarePrint.draw(square);

        Rectangl rectangl = new Rectangl();
        RectanglPrinter rectanglPrinter = new RectanglPrinter();
        rectanglPrinter.draw(rectangl);
    }
}
