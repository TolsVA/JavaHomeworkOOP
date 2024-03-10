package org.example.notebook.util;

import java.io.File;

import static java.lang.System.*;
public class DBConnector {
    public static final String DB_PATH = "db.txt";
    public static void createDB() {
        try {
            File db = new File(DB_PATH);
            if (db.createNewFile()) {
                out.println("DB created");
            }
            else {
                out.println("DB already exists");
            }
        }
        catch (Exception e) {
            err.println(e);
        }
    }
}