package org.example.calculator_complex_number.ui;

import org.example.calculator_complex_number.ui.view.impl.View;

public class ApplicationRunner {
    private ApplicationRunner() {
        new View().run();
    }

    public static void run(){
        new ApplicationRunner();
    }
}