package org.example.calculator_complex_number.ui.view.impl;

import org.example.calculator_complex_number.Main;
import org.example.calculator_complex_number.logger.Log;
import org.example.calculator_complex_number.ui.view.presenter.CalcValidatorIpl;
import org.example.calculator_complex_number.ui.view.presenter.Presenter;
import org.example.calculator_complex_number.ui.view.ShowView;
import org.example.calculator_complex_number.ui.calculator.impl.Commands;
import org.example.calculator_complex_number.ui.calculator.ComplexNumber;


import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.System.*;

public class View implements ShowView{
    protected static final Logger log = Log.log(Main.class.getName());
    protected Commands com;

    public void run() {
        Presenter presenter = new Presenter(this, new CalcValidatorIpl());
        while (true) {
            String command = presenter.promptCommand().toUpperCase();
            while (!isContains(command)) {
                out.println("Такой команды нет!!!\nСписок команд: -> " + Arrays.toString(Commands.values()) + "\n");
                command = presenter.promptCommand().toUpperCase();
            }

            com = Commands.valueOf(command);

            if (com == Commands.EXIT) return;
            presenter.apply(com);
        }
    }

    private boolean isContains(String command) {
        Commands[] values = Commands.values();
        for (Commands value : values) {
            if (command.equals(value.name())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void showResult(ComplexNumber complexNumberResult, ComplexNumber c1, ComplexNumber c2) {
        log.log(Level.INFO, () -> String.format(com.getFormat(), c1, c2, complexNumberResult));
    }

    @Override
    public void show(ComplexNumber complexNumber) {
        out.println("КЧ" + complexNumber);
    }
}