package org.designpatterns.singleton;

public class App {
    public static void main(String[] args) {
        DbManager dbManager1 = new DbManager();
        DbManager dbManager2 = new DbManager();

        //DbManagerLazy dbManagerLazy = new DbManagerLazy();    // Compilation error because the constructor is private
        DbManagerLazy dbManagerLazy1 = DbManagerLazy.getInstance();
        DbManagerLazy dbManagerLazy2 = DbManagerLazy.getInstance(); // Will point to the same object

        DbManagerEager dbManagerEager = DbManagerEager.getInstance();

        DbManagerThreadSafe dbManagerThreadSafe = DbManagerThreadSafe.getInstance();

        DbManagerBillPugh dbManagerBillPugh = DbManagerBillPugh.getInstance();
    }
}
