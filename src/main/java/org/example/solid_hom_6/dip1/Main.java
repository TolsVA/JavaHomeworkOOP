package org.example.solid_hom_6.dip1;

import org.example.solid_hom_6.dip1.model.Report;
import org.example.solid_hom_6.logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();
        report.output();
    }
}
