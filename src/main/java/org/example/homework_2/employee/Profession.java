package org.example.homework_2.employee;

public abstract class Profession {
    private String nameProfession;
    private int personnelNumber;
    private double salary;// зарплата

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNameProfession() {
        return nameProfession;
    }

    public void setNameProfession(String nameProfession) {
        this.nameProfession = nameProfession;
    }

    protected Profession(String nameProfession, int personnelNumber, double salary) {
        this.nameProfession = nameProfession;
        this.personnelNumber = personnelNumber;
        this.salary = salary;
    }

    public abstract void job();
}
