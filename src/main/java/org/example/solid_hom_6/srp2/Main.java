package org.example.solid_hom_6.srp2;

import org.example.solid_hom_6.srp2.model.*;

public class Main {
    public static void main(String[] args) {
        MyConsole console = new MyConsole();
        Client client = new Client(console.prompt("Client name: "));
        Product product = new Product(
                console.prompt("Product: "),
                Integer.parseInt(console.prompt("Quantity: ")),
                Integer.parseInt(console.prompt("Price: "))
        );
        Order order = new Order(client, product, new SaveToJson());
        order.saveToJson(order);
    }
}
