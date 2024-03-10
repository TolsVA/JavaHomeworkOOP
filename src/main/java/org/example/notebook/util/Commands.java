package org.example.notebook.util;

public enum Commands {
    NONE("Пусто"), READ("Читать"), READ_ALL("Читать всё"), CREATE("Создать"),
    UPDATE("Обновить"), LIST("Список команд"), DELETE("Удалить"), EXIT("Выход");

    private final String translation;

    Commands(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}