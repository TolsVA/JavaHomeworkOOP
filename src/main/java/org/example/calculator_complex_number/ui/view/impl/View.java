package org.example.calculator_complex_number.ui.view.impl;

import org.example.calculator_complex_number.ui.calculator.impl.Complex;
import org.example.calculator_complex_number.ui.Method;
import org.example.calculator_complex_number.ui.view.Observer;

import static java.lang.System.*;

public class View implements Observer{
    private Complex c1;
    private Complex c2;
    public void run() {
        c1 = new Complex(1, 2);
        c2 = new Complex(2, -1);
        Method.PLUS.apply(c1, c2);
        Method.MINUS.apply(c1, c2);
        Method.MULTIPLY.apply(c1, c2);
        Method.DIVIDE.apply(c1, c2);
    }

    @Override
    public void print(Complex complex, String name) {
        out.printf("%s%%n".formatted(name), c1, c2, complex);
    }
}
