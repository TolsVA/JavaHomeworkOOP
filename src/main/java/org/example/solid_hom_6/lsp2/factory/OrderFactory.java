package org.example.solid_hom_6.lsp2.factory;


import org.example.solid_hom_6.lsp2.model.Order;
import org.example.solid_hom_6.lsp2.model.OrderBonus;

public class OrderFactory {
    public Order create(int quantity, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(quantity, price);
        }
        return new Order(quantity, price);
    }
}
