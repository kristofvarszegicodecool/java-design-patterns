package org.designpatterns.singleton;

public class DbManagerThreadSafe {
    private static DbManagerThreadSafe instance = null;

    DbConnection dbConnection;

    private DbManagerThreadSafe() {
        connect();
    }

    private void connect() {
        // Connecting to e.g. a PostgreSQL database
        dbConnection = new DbConnection();
        // ...
    }

    /*public static synchronized DbManagerThreadSafe getInstance() {
        if (instance == null) {
            instance = new DbManagerThreadSafe();
        }
        return instance;
    }*/

    public static DbManagerThreadSafe getInstance() {
        if (instance == null) {
            synchronized(DbManagerThreadSafe.class) {
                if (instance == null) {
                    instance = new DbManagerThreadSafe();
                }
            }
        }
        return instance;
    }
}
