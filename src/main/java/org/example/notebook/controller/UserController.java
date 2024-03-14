package org.example.notebook.controller;

import org.example.notebook.model.User;
import org.example.notebook.model.repository.GBRepository;
import org.example.notebook.util.UserValidator;
import java.util.Optional;

public class UserController {
    private final GBRepository repository;
    private final UserValidator uv = new UserValidator();
    private static final String ENTER_USER_ID = "Enter user id: ";

    public UserController(GBRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.create(user);
    }

    public void readUser() {
        getId();
    }

    public void readAll() {
        repository.findAll();
    }

    public void updateUser() {
        long id = Long.parseLong(uv.prompt(ENTER_USER_ID));
        Optional<User> userOptional = repository.findById(id).map(user -> {
            repository.update(id, uv.updateUser(user));
            repository.notifyObserver("Данные успешно обновлены\n");
            return user;
        });
        if (userOptional.isEmpty()){
            repository.notifyObserver("Такого контакта нет\n");
        }
    }

    public void deleteUser() {
        long id = Long.parseLong(uv.prompt(ENTER_USER_ID));
        repository.delete(id);
    }

    public void getId() {
        long id = Long.parseLong(uv.prompt(ENTER_USER_ID));
        Optional<User> userOptional = repository.findById(id).map(user -> {
            repository.notifyObserver(user.toString());
            return user;
        });

        if (userOptional.isEmpty()){
            repository.notifyObserver("Такого контакта нет\n");
        }
    }

    public void createUser() {
        saveUser(uv.createUser());
    }

    public String prompt(String message) {
        return uv.prompt(message);
    }
}
