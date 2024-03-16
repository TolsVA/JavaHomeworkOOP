package org.example.calculator_complex_number.ui;

import org.example.calculator_complex_number.ui.calculator.impl.Complex;

public interface Publisher {
    void notifyObserver(Complex complex);
}
