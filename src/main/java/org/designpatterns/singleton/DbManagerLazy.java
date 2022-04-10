package org.designpatterns.singleton;

public class DbManagerLazy {
    private static DbManagerLazy instance = null;

    DbConnection dbConnection;

    private DbManagerLazy() {
        connect();
    }

    private void connect() {
        // Connecting to e.g. a PostgreSQL database
        dbConnection = new DbConnection();
        // ...
    }

    public static DbManagerLazy getInstance() {
        System.out.println("Getting DbManagerLazy instance...");
        if (instance == null) {
            System.out.println("Instantiating DbManagerLazy...");
            instance = new DbManagerLazy();
        }
        return instance;
    }
}
