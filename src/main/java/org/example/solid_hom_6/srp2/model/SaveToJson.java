package org.example.solid_hom_6.srp2.model;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson implements Save{
    public void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClient().getName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct().getNameProduct()+"\",\n");
            writer.write("\"qnt\":"+ order.getProduct().getQuantity() +",\n");
            writer.write("\"price\":"+order.getProduct().getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
