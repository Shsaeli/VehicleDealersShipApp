package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {
    public Dealership getDealership() {
        Dealership d = new Dealership();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

            String firstLine = bufferedReader.readLine();

            String [] DealershipInfo = firstLine.split("\\|");


            ArrayList<Vehicle> ListOfVehicle = new ArrayList<> ();

            while((firstLine =bufferedReader.readLine())!=null)
            {
                String [] vehicleInfo = firstLine.split("\\|");
                Vehicle v = new Vehicle(vehicleInfo[0], vehicleInfo[1],vehicleInfo[2],vehicleInfo[3],vehicleInfo[4], vehicleInfo[5],vehicleInfo[6],vehicleInfo[7]);
                ListOfVehicle.add(v);
            }
            d(DealershipInfo[0],DealershipInfo[1],DealershipInfo[2], ListOfVehicle);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }

    public void saveDealership(Dealership d1) {

    }
}
