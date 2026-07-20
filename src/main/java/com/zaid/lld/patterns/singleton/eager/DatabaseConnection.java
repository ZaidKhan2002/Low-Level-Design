package com.zaid.lld.patterns.singleton.eager;

public class DatabaseConnection {

    private static final DatabaseConnection INSTANCE =
            new DatabaseConnection();

    private DatabaseConnection() {
        System.out.println("Database Connection Created");
    }

    public static DatabaseConnection getInstance() {
        return INSTANCE;
    }

}
