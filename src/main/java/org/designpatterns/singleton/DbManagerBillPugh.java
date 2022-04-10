package org.designpatterns.singleton;

public class DbManagerBillPugh {
    DbConnection dbConnection;

    private static class DbManagerHelper {
        private static final DbManagerBillPugh INSTANCE = new DbManagerBillPugh();
    }

    private DbManagerBillPugh() {
        connect();
    }

    private void connect() {
        // Connecting to e.g. a PostgreSQL database
        dbConnection = new DbConnection();
        // ...
    }

    public static DbManagerBillPugh getInstance() {
        return DbManagerHelper.INSTANCE;
    }

}
