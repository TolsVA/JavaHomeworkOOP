package org.example.solid_hom_6.homework;

import org.example.solid_hom_6.homework.report.Reportable;
import org.example.solid_hom_6.homework.sav.Savable;

public class Presenter {
    private final Savable savable;
    private final Reportable reportable;

    public Presenter(Savable savable, Reportable reportable) {
        this.savable = savable;
        this.reportable = reportable;
    }

    public void save(User user){
        savable.save(user);
    }

    public void report(User user){
        reportable.report(user);
    }
}
