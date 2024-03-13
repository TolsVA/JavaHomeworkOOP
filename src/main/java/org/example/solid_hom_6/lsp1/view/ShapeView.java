package org.example.solid_hom_6.lsp1.view;

import org.example.solid_hom_6.lsp1.shape.Rectangle;

public class ShapeView {
    private final Rectangle rectangle;

    public ShapeView(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(rectangle.getArea());
    }
}
