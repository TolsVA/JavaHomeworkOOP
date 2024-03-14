package org.example.solid_hom_6.lsp1.view;

import org.example.solid_hom_6.lsp1.shape.Quadrilateral;
public class ShapeView<T extends Quadrilateral> {
    private final T quadrilateral;

    public ShapeView(T quadrilateral) {
        this.quadrilateral = quadrilateral;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(quadrilateral.getArea());
    }
}
