package org.example.calculator_complex_number.ui.calculator.impl;

public record Complex(double re, double im) {

    private String getComplexString() {
        String strIm = String.valueOf(re);
        if (im > 0 && im != 1) {
            strIm += " + " + im + " * i ";
        } else if (im == 1) {
            strIm += " + i ";
        } else if (im < 0 && im != -1) {
            strIm += " " + im + " * i ";
        } else if (im == -1) {
            strIm += " - i ";
        }
        return strIm;
    }

    @Override
    public String toString() {
        return getComplexString();
    }
}
