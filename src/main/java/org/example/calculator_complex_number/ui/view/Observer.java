package org.example.calculator_complex_number.ui.view;

import org.example.calculator_complex_number.ui.calculator.impl.Complex;

public interface Observer {
    void print(Complex complex, String name);
}
