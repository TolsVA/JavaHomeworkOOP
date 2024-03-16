package org.example.calculator_complex_number.ui;

import org.example.calculator_complex_number.ui.view.impl.View;

public class ApplicationRunner {
    private ApplicationRunner() {
        View view = new View();
        Method.setObserver(view);
        view.run();
    }

    public static void run(){
        new ApplicationRunner();
    }
}
