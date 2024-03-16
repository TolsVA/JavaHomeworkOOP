package org.example.calculator_complex_number.ui;

import org.example.calculator_complex_number.ui.calculator.Calculable;
import org.example.calculator_complex_number.ui.calculator.impl.Complex;
import org.example.calculator_complex_number.ui.view.Observer;

public enum Method implements Publisher {
    PLUS("Сложение КЧ ( %s) + ( %s) = ( %s)", (x, y) -> new Complex(x.re() + y.re(), x.im() + y.im())),
    MINUS("Вычетание КЧ ( %s) - ( %s) = ( %s)", (x, y) -> new Complex(x.re() - y.re(), x.im() - y.im())),
    MULTIPLY("Умножение КЧ ( %s) * ( %s) = ( %s)", (x, y) -> new Complex(
            x.re() * y.re() - x.im() * y.im(),
            x.re() * y.im() + x.im() * y.re()
    )),
    DIVIDE("Деление КЧ ( %s) / ( %s) = ( %s)", (x, y) -> {
        double divider = y.re() * y.re() + y.im() * y.im();
        double re = (x.re() * y.re() + x.im() * y.im()) / divider;
        double im = (x.re() * y.im() + x.im() * y.re() * (-1)) / divider;
        return new Complex(re, im);
    });

    private final Calculable calculable;
    private final String translation;
    private static Observer observer;

    Method(String translation, Calculable calculable) {
        this.translation = translation;
        this.calculable = calculable;
    }

    static void setObserver(Observer observer) {
        Method.observer = observer;
    }

    public String getTranslation() {
        return translation;
    }

    public void apply(Complex x, Complex y) {
        notifyObserver(calculable.calculation(x, y));
    }

    @Override
    public void notifyObserver(Complex complex) {
        observer.print(complex, getTranslation());
    }
}
