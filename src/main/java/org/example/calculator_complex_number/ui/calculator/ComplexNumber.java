package org.example.calculator_complex_number.ui.calculator;

public record ComplexNumber(double re, double im) {

    private String getComplexString() {
        String cn = "";
        if(re != 0) {
            cn = String.valueOf(re);
            if (im > 0) cn += " + " + im + " * i";
            if (im < 0) cn += " - " + Math.abs(im) + " * i";
        } else {
            if (im != 0) cn += im + " * i";
        }

        if (re == 0 && im == 0) cn = "0 + 0 * i";

        return "( " + cn + " )";
    }

    @Override
    public String toString() {
        return getComplexString();
    }
}
