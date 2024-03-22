package org.example.calculator_complex_number.ui.calculator.impl;

import org.example.calculator_complex_number.ui.calculator.Commands;
import org.example.calculator_complex_number.ui.calculator.ComplexNumber;

public class Multiply extends Commands {
    public Multiply(){
        this.format ="Умножение КЧ %s * %s = %s";
        this.calculable = (x, y) -> new ComplexNumber(
                x.re() * y.re() - x.im() * y.im(),
                x.re() * y.im() + x.im() * y.re()
        );
    }
}