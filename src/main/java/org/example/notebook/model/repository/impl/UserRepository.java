package org.example.notebook.model.repository.impl;

import org.example.notebook.model.User;
import org.example.notebook.model.repository.GBRepository;
import org.example.notebook.model.repository.Publisher;
import org.example.notebook.util.DBConnector;
import org.example.notebook.util.mapper.impl.UserMapper;
import org.example.notebook.view.Observer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.lang.System.*;

public class UserRepository implements GBRepository {
    private final UserMapper mapper;
    private final String fileName;
    private Observer observer;
    public UserRepository() {
        this.mapper = new UserMapper();

        this.fileName = DBConnector.DB_PATH;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException e) {
            out.println(e.getMessage());
        }
    }

    @Override
    public void findAll() {
        List<User> users = fillList();
        for (User user : users){
            notifyObserver(user + "\n");
        }
    }

    private List<User> fillList() {
        List<String> lines = readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public void create(User user) {
        List<User> users = fillList();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id){
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);
        write(users);
        notifyObserver("User: " + user.getFirstName() + " успешно сохранён.\n");
    }

    @Override
    public Optional<User> findById(Long id) {
        return fillList().stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }

    @Override
    public void update(Long userId, User update) {
        List<User> users = fillList();
        User editUser = users.stream()
                .filter(u -> u.getId().equals(userId))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));
        if (!update.getFirstName().isEmpty()) {
            editUser.setFirstName(update.getFirstName());
        }
        if (!update.getLastName().isEmpty()) {
            editUser.setLastName(update.getLastName());
        }
        if (!update.getPhone().isEmpty()) {
            editUser.setPhone(update.getPhone());
        }
        write(users);
    }

    @Override
    public void delete(Long id) {
        List<User> users = fillList();
        List<User> usersResult = users.stream().filter(user -> !user.getId().equals(id)).toList();
        if (users.size() != usersResult.size()) {
            write(usersResult);
            notifyObserver("Данные успешно удалены\n");
        } else {
            notifyObserver("Контакта с таким id нет.\n");
        }
    }

    private void write(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User u: users) {
            lines.add(mapper.toInput(u));
        }
        saveAll(lines);
    }

    @Override
    public List<String> readAll() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                // считываем остальные строки в цикле
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    @Override
    public void saveAll(List<String> data) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : data) {
                // запись всей строки
                writer.write(line);
                // запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            out.println(e.getMessage());
        }
    }

    @Override
    public void addObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObserver(String message) {
        observer.print(message);
    }
}
