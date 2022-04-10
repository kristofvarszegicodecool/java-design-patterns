package org.designpatterns.singleton;

public class DbManagerEager {
    private static DbManagerEager instance = new DbManagerEager();

    DbConnection dbConnection;

    private DbManagerEager() {
        connect();
    }

    private void connect() {
        // Connecting to e.g. a PostgreSQL database
        dbConnection = new DbConnection();
        // ...
    }

    public static DbManagerEager getInstance() {
        return instance;
    }
}
