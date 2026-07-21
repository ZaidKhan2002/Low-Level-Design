package com.zaid.lld.patterns.singleton.enumsingleton;

public class Main {

    public static void main(String[] args) {

        DatabaseConnection db1 = DatabaseConnection.INSTANCE;
        DatabaseConnection db2 = DatabaseConnection.INSTANCE;

        db1.connect();

        System.out.println(db1 == db2);

    }

}
