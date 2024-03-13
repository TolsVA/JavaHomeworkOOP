package org.example.solid_hom_6.srp2.model;

public  class Product {
    private String nameProduct;
    private int quantity;
    private int price;

    public Product(String nameProduct, int quantity, int price) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
