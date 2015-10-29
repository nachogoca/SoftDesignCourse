package mx.iteso.singleton.tables;

import mx.iteso.singleton.TableOrder;

import java.util.ArrayList;

public class Table1 extends TableOrder {

    // Volatile keyword ensures multiple threads handle the instance correctly
    private volatile static TableOrder uniqueInstance;

    private Table1(){
        tableName = "Table 1";
        drinks = new ArrayList();
        dishes = new ArrayList();
    }

    public static TableOrder getInstance(){
        if(uniqueInstance == null){
            // Synchronized block, only the first time.
            synchronized (Table1.class) {
                if (uniqueInstance == null) // If nothing has changed..
                {
                    uniqueInstance = new Table1();
                }
            }
        }


        return uniqueInstance;
    }

    public static void clearOrder(){
        uniqueInstance = null;
    }

}

