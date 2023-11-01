package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {
    public Dealership getDealership() {
        Dealership d = new Dealership();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));
            while(String line = bufferedReader.readLine()!=null;);
            {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }

    public void saveDealership(Dealership d1) {

    }
}
