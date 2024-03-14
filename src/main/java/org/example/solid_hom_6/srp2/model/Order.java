package org.example.solid_hom_6.srp2.model;

public class Order {
    private final Client client;
    private final Product product;
    private final Save save;

    public Order(Client client, Product product, Save save) {
        this.client = client;
        this.product = product;
        this.save = save;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public void saveToJson(Order order){
        save.saveToJson(order);
    }

}