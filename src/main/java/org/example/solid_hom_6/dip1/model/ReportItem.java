package org.example.solid_hom_6.dip1.model;

public class ReportItem {
    private final String description;
    private final float amount;

    public ReportItem(String description, float amount){
        this.description = description;
        this.amount = amount;
    }
    public String getDescription(){
        return description;
    }
    public float getAmount(){
        return amount;
    }
}
