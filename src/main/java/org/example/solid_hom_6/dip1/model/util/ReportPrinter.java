package org.example.solid_hom_6.dip1.model.util;


import org.example.solid_hom_6.dip1.model.ReportItem;
import org.example.solid_hom_6.dip1.model.Reportable;

import java.util.List;

public class ReportPrinter implements Reportable{
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
