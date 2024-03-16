package org.example.notebook;

import org.example.notebook.controller.UserController;
import org.example.notebook.model.repository.GBRepository;
import org.example.notebook.model.repository.impl.UserRepository;
import org.example.notebook.view.UserView;

import static org.example.notebook.util.DBConnector.createDB;

public class App {
    public void run() {
        createDB();
        GBRepository repository = new UserRepository();
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        repository.addObserver(view);
        view.run();
    }
}
