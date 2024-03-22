package org.example.calculator_complex_number.ui.calculator.impl;

import org.example.calculator_complex_number.ui.calculator.Commands;
import org.example.calculator_complex_number.ui.calculator.ComplexNumber;

public class Plus extends Commands {
    public Plus(){
        this.format ="Сложение КЧ %s + %s = %s";
        this.calculable = (x, y) -> new ComplexNumber(x.re() + y.re(), x.im() + y.im());
    }
}
