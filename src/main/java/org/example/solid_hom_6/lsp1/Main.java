package org.example.solid_hom_6.lsp1;

import org.example.solid_hom_6.lsp1.shape.Quadrilateral;
import org.example.solid_hom_6.lsp1.shape.Rectangle;
import org.example.solid_hom_6.lsp1.shape.Square;
import org.example.solid_hom_6.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Quadrilateral square = new Square(4);
        Quadrilateral rectangle = new Rectangle(4, 5);

        ShapeView<Quadrilateral> view = new ShapeView<>(square);
        ShapeView<Quadrilateral> view2 = new ShapeView<>(rectangle);
        view.showArea();
        view2.showArea();
    }
}
