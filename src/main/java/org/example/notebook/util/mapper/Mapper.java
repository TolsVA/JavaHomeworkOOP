package org.example.notebook.util.mapper;

import org.example.notebook.model.User;

public interface Mapper {
    String toInput(User e);
    User toOutput(String str);
}
