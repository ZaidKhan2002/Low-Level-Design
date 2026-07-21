package com.zaid.lld.patterns.singleton.synchronizedsingleton;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database Connection Created");
    }

    public static synchronized DatabaseConnection getInstance() {

        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

}


// Same as Lazy but just 'synchronized' keyword does the work.
