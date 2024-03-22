package org.example.calculator_complex_number.ui.calculator.impl;

import org.example.calculator_complex_number.ui.calculator.Commands;
import org.example.calculator_complex_number.ui.calculator.ComplexNumber;

public class Divide extends Commands {
    public Divide(){
        this.format ="Деление КЧ %s / %s = %s";
        this.calculable = (x, y) -> {
            double divider = y.re() * y.re() + y.im() * y.im();
            double re = (x.re() * y.re() + x.im() * y.im()) / divider;
            double im = (x.re() * y.im() + x.im() * y.re() * (-1)) / divider;
            return new ComplexNumber(re, im);
        };
    }
}