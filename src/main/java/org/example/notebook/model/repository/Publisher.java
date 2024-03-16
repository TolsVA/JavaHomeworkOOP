package org.example.notebook.model.repository;

import org.example.notebook.view.Observer;

public interface Publisher {
    void addObserver(Observer observer);
    void notifyObserver(String message);
}
