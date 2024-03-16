package org.example.notebook.model.repository;

import org.example.notebook.model.User;
import org.example.notebook.view.Observer;

import java.util.List;
import java.util.Optional;

public interface GBRepository extends Publisher {
    void findAll();
    void create(User user);
    Optional<User> findById(Long id);
    void update(Long userId, User update);
    void delete(Long id);
    List<String> readAll();
    void saveAll(List<String> data);
}
