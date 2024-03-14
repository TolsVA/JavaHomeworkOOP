package org.example.solid_hom_6.dip1.model;

import java.util.List;

public class ReportMenager {

    private Reportable reportable;

    public ReportMenager(Reportable reportable) {
        this.reportable = reportable;
    }

    public void toOutput(List<ReportItem> items) {
        reportable.output(items);
    }
}
