package org.example.notebook.util;

import org.example.notebook.model.User;

import java.util.Scanner;

import static java.lang.System.*;

public class UserValidator {

    public User createUser() {
        String firstName = checkLine(prompt("Имя: "));
        String lastName = checkLine(prompt("Фамилия: "));
        String phone = checkLine(prompt("Номер телефона: "));
        return new User(firstName, lastName, phone);
    }

    public User updateUser(User user) {
        user.setFirstName(prompt("Имя: "));
        user.setLastName(prompt("Фамилия: "));
        user.setPhone(prompt("Номер телефона: "));
        return user;
    }

    private String checkLine(String str){
        str = str.trim().replace(" ", "");
        if (str.isEmpty()){
            out.println("Значение не может быть пустым.\nВведите корректные данные: ");
            str = checkLine(prompt(str));
        }
        return str;
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        out.print(message);
        return in.nextLine();
    }
}
