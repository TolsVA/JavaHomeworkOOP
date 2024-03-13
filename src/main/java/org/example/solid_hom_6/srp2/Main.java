package org.example.solid_hom_6.srp2;

import org.example.solid_hom_6.srp2.model.Client;
import org.example.solid_hom_6.srp2.model.MyConsole;
import org.example.solid_hom_6.srp2.model.Order;
import org.example.solid_hom_6.srp2.model.Product;

public class Main {
    public static void main(String[] args) {
        MyConsole console = new MyConsole();
        Client client = new Client(console.prompt("Client name: "));
        Product product = new Product(
                console.prompt("Product: "),
                Integer.parseInt(console.prompt("Quantity: ")),
                Integer.parseInt(console.prompt("Price: "))
        );

//        System.out.println("Enter order:");
//        Order order = new Order("", "", 0, 0);
//        order.inputFromConsole();
//        order.saveToJson();
    }
}
