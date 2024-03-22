package org.example.calculator_complex_number.ui.view.impl;

import org.example.calculator_complex_number.Main;
import org.example.calculator_complex_number.logger.Log;
import org.example.calculator_complex_number.ui.calculator.*;
import org.example.calculator_complex_number.ui.calculator.impl.*;
import org.example.calculator_complex_number.ui.view.presenter.CalcValidatorIpl;
import org.example.calculator_complex_number.ui.view.presenter.Presenter;
import org.example.calculator_complex_number.ui.view.ShowView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.System.*;

public class View implements ShowView{
    protected static final Logger log = Log.log(Main.class.getName());
    protected Commands com;
    ArrayList<Commands> commands;

    public void run() {
        Presenter presenter = new Presenter(this, new CalcValidatorIpl());
        commands = initCommands();

        while (true) {
            String command = presenter.promptCommand().toUpperCase();
            while (!isContains(command)) {
                out.println("Такой команды нет!!!\nСписок команд: -> " + Arrays.toString(printClassName(commands)) + "\n");
                command = presenter.promptCommand().toUpperCase();
            }

            com = getCommands(command);

            if (com != null) {
                if (com.getClass().getSimpleName().equalsIgnoreCase("EXIT")) return;
                presenter.apply(com);
            }
        }
    }

    private String[] printClassName(ArrayList<Commands> commands) {
        String[] strings = new String[commands.size()];
        for (int i = 0; i < commands.size(); i++) {
            strings[i] = commands.get(i).getClass().getSimpleName().toUpperCase();
        }
        return strings;
    }

    private Commands getCommands(String strCommand) {
        for (Commands value : commands) {
            if (strCommand.equals(value.getClass().getSimpleName().toUpperCase())) {
                return value;
            }
        }
        return null;
    }

    private ArrayList<Commands> initCommands() {
        commands = new ArrayList<>();
        commands.add(new Plus());
        commands.add(new Minus());
        commands.add(new Multiply());
        commands.add(new Divide());
        commands.add(new Exit());
        return commands;
    }

    private boolean isContains(String command) {
        for (Commands value : commands) {
            if (command.equals(value.getClass().getSimpleName().toUpperCase())) {
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