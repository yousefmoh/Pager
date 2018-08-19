package com.example.hp.testfragment;

/**
 * Created by dexter on 8/19/2018.
 */

public class Singleton {
    private static Singleton uniqInstance;
    private  String data ;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (uniqInstance == null) {
            {
                if (uniqInstance == null)
                    uniqInstance = new Singleton();
            }
        }
        return uniqInstance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
