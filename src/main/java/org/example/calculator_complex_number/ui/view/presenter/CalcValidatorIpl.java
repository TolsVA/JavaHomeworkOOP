package org.example.calculator_complex_number.ui.view.presenter;


import org.example.calculator_complex_number.ui.calculator.ComplexNumber;
import org.example.calculator_complex_number.ui.view.ConsoleManager;

import java.util.Scanner;

import static java.lang.System.*;

public class CalcValidatorIpl implements ConsoleManager {
    @Override
    public ComplexNumber createCalc() {
        double real = promptComplexNumber("Действительная часть кч: ");
        double imaginary = promptComplexNumber("Мнимая часть кч: ");
        return new ComplexNumber(real, imaginary);
    }

    public double promptComplexNumber(String message) {
        Scanner in = new Scanner(System.in);
        out.print(message);
        while (!in.hasNextDouble()){
            out.println("Это не число. \nВведите число\n" + message);
            in.next();
        }
        return in.nextDouble();
    }

    @Override
    public String promptCommands() {
        return checkLine(prompt("Введите команду: "));
    }

    private String checkLine(String str){
        str = str.trim().replace(" ", "");
        if (str.isEmpty()){
            out.println("Значение не может быть пустым.\nВведите корректные данные: ");
            str = checkLine(prompt(str));
        }
        return str;
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        out.print(message);
        return in.nextLine();
    }
}
