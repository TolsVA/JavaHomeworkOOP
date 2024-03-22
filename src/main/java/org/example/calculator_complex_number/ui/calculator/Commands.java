package org.example.calculator_complex_number.ui.calculator;

public abstract class Commands {
    protected Calculable calculable;
    protected String format;

    public String getFormat() {
        return format;
    }

    public Calculable getFunction() {
        return calculable;
    }
}