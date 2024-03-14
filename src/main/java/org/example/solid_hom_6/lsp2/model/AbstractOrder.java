package org.example.solid_hom_6.lsp2.model;

public abstract class AbstractOrder {
    private final int price;
    private final int quantity;

    protected AbstractOrder(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getAmount() {
        return quantity * price;
    }
    @Override
    public String toString() {
        return String.format("Quantity = %d, Price = %d", quantity, price);
    }
}
