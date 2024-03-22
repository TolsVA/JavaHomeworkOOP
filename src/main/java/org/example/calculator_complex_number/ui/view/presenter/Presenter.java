package org.example.calculator_complex_number.ui.view.presenter;

import org.example.calculator_complex_number.ui.calculator.Commands;
import org.example.calculator_complex_number.ui.view.ConsoleManager;
import org.example.calculator_complex_number.ui.calculator.ComplexNumber;
import org.example.calculator_complex_number.ui.view.ShowView;

import static java.lang.System.*;

public class Presenter {
    private final ShowView showView;
    private final ConsoleManager consoleManager;

    public Presenter(ShowView showView, ConsoleManager consoleManager) {
        this.showView = showView;
        this.consoleManager = consoleManager;
    }

    public String promptCommand() {
        return consoleManager.promptCommands().toUpperCase();
    }

    public ComplexNumber createComplexNumber() {
        ComplexNumber complexNumber = consoleManager.createCalc();
        showView.show(complexNumber);
        return complexNumber;
    }

    public void apply(Commands com) {
        out.println("Первое комлексное число");
        ComplexNumber c1 = createComplexNumber();
        out.println("Второе комлексное число");
        ComplexNumber c2 = createComplexNumber();
        ComplexNumber complexNumberResult = com.getFunction().calculation(c1, c2);
        showView.showResult(complexNumberResult, c1, c2);
    }
}
