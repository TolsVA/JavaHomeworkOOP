package org.example.calculator_complex_number.ui.calculator.impl;

import org.example.calculator_complex_number.ui.calculator.Calculable;
import org.example.calculator_complex_number.ui.calculator.ComplexNumber;

public enum Commands {
    PLUS("Сложение КЧ %s + %s = %s", (x, y) -> new ComplexNumber(x.re() + y.re(), x.im() + y.im())),
    MINUS("Вычетание КЧ %s - %s = %s", (x, y) -> new ComplexNumber(x.re() - y.re(), x.im() - y.im())),
    MULTIPLY("Умножение КЧ %s * %s = %s", (x, y) -> new ComplexNumber(
            x.re() * y.re() - x.im() * y.im(),
            x.re() * y.im() + x.im() * y.re()
    )),
    DIVIDE("Деление КЧ %s / %s = %s", (x, y) -> {
        double divider = y.re() * y.re() + y.im() * y.im();
        double re = (x.re() * y.re() + x.im() * y.im()) / divider;
        double im = (x.re() * y.im() + x.im() * y.re() * (-1)) / divider;
        return new ComplexNumber(re, im);
    }),
    EXIT("", null);

    private final Calculable calculable;
    private final String format;

    Commands(String format, Calculable calculable) {
        this.format = format;
        this.calculable = calculable;
    }

    public String getFormat() {
        return format;
    }

    public Calculable getFunction() {
        return calculable;
    }
}
