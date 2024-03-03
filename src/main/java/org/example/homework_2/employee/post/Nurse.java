package org.example.homework_2.employee.post;

import org.example.homework_2.employee.Profession;

public class Nurse extends Profession implements NurseContract{
    public Nurse(String nameProfession, int personnelNumber, double salary) {
        super(nameProfession, personnelNumber, salary);
    }

    @Override
    public void job() {
        giveInjections();
    }

    @Override
    public void giveInjections() {
        System.out.println("Мед сестра ставит уколы");
    }
}
