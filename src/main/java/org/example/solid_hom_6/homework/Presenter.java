package org.example.solid_hom_6.homework;

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
