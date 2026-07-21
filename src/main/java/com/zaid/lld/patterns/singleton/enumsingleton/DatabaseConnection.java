package com.zaid.lld.patterns.singleton.enumsingleton;

public enum DatabaseConnection {

    INSTANCE;

    DatabaseConnection() {
        System.out.println("Database Connection Created");
    }

    public void connect() {
        System.out.println("Connected to Database");
    }

}
