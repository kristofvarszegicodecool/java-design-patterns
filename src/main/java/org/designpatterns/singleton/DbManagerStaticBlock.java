package org.designpatterns.singleton;

public class DbManagerStaticBlock {
    private static DbManagerStaticBlock instance;

    DbConnection dbConnection;

    static {
        instance = new DbManagerStaticBlock();
    }

    private DbManagerStaticBlock() {
        connect();
    }

    private void connect() {
        // Connecting to e.g. a PostgreSQL database
        dbConnection = new DbConnection();
        // ...
    }

    public static DbManagerStaticBlock getInstance() {
        return instance;
    }
}
