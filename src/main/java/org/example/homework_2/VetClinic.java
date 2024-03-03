package org.example.homework_2;

import org.example.homework_2.animal.Animal;
import org.example.homework_2.employee.Employee;

import java.util.List;

public class VetClinic {
    private final long inn;
    private final String nameCompany;
    private final String legalAddress;
    private final List<Employee> employees = new MyArrayList<>();
    private final List<Animal> patients = new MyArrayList<>();

    public VetClinic(long inn, String nameCompany, String legalAddress){
        this.inn = inn;
        this.nameCompany = nameCompany;
        this.legalAddress =legalAddress;
    }

    public long getInn() {
        return inn;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public VetClinic addEmployee(Employee employee) {
        this.employees.add(employee);
        return this;
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public VetClinic addPatients(Animal patient) {
        this.patients.add(patient);
        return this;
    }

    @Override
    public String toString() {
        return "Ветеринарная клиника: " + nameCompany +
                " ИНН" + inn +
                " Юридический Адрес" +
                "\n\tСписок сотрудников:" + employees +
                "\n\tСписок пациентов:" + patients;
    }
}
