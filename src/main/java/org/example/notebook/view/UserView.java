package org.example.notebook.view;

import org.example.notebook.controller.UserController;
import org.example.notebook.util.Commands;

import java.util.Arrays;

import static java.lang.System.*;

public class UserView implements Observer{
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }
    public void run() {
        Commands com;

        while (true) {
            String command = userController.prompt("Введите команду: ").toUpperCase();
            while (!isContains(command)) {
                print("Такой команды нет!!!\nСписок команд: -> " + Arrays.toString(Commands.values()) + "\n");
                command = userController.prompt("Введите команду: ").toUpperCase();
            }

            com = Commands.valueOf(command);

            if (com == Commands.EXIT) return;
            runSwitch(com);
        }
    }

    private void runSwitch(Commands com) {
        switch (com) {
            case CREATE -> userController.createUser();
            case NONE -> userController.getId();
            case READ -> userController.readUser();
            case READ_ALL -> userController.readAll();
            case UPDATE -> userController.updateUser();
            case LIST -> print(
                    Arrays.stream(Commands.values())
                            .map(c -> "(" + c + " -> " + c.getTranslation() + ")")
                            .toList() + "\n"
            );
            case DELETE -> userController.deleteUser();

            default -> throw new IllegalStateException("Unexpected value: " + com);
        }
    }

    private boolean isContains(String command) {
        Commands[] values = Commands.values();
        for (Commands value : values) {
            if (value.toString().equals(command)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void print(String str) {
        out.print(str);
    }
}
