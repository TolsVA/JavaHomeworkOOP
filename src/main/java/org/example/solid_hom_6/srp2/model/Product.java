package org.example.solid_hom_6.srp2.model;

public  class Product {
    private final String nameProduct;
    private final int quantity;
    private final int price;

    public Product(String nameProduct, int quantity, int price) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }
    public int getPrice() {
        return price;
    }
}
