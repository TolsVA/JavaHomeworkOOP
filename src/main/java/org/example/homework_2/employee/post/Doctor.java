package org.example.homework_2.employee.post;

import org.example.homework_2.employee.Profession;

public class Doctor extends Profession implements DoctorsContract {

    public Doctor(String nameProfession, int personnelNumber, double salary) {
        super(nameProfession, personnelNumber, salary);
    }

    @Override
    public void job() {
        diagnose();
        prescribeTreatment();
        prescribeMedication();
        issueSickLeave();
    }

    @Override
    public void diagnose() {
        System.out.println("Доктор ставит диагноз");
    }

    @Override
    public void prescribeTreatment() {
        System.out.println("Доктор прописывает лечение");
    }

    @Override
    public void prescribeMedication() {
        System.out.println("Доктор выписывает лекарство");
    }

    @Override
    public void issueSickLeave() {
        System.out.println("Доктор выписывает болничный лист");
    }
}
