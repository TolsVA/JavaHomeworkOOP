package org.example.solid_hom_6.lsp1.shape;

public class Square  implements Quadrilateral {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
