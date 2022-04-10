package org.designpatterns.singleton;

public class DbManager {
    DbConnection dbConnection;

    public DbManager() {
        connect();
    }

    private void connect() {
        // Connecting to e.g. a PostgreSQL database
        dbConnection = new DbConnection();
        // ...
    }
}
