package com.pluralsight;

import javax.lang.model.type.ArrayType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Dealership dealership;

    UserInterface()
    {

    }


    public void display()
    {
     init();


     while( true)
     {
     System.out.printf("""
             WELCOME TO SHASAELI INC.
             choose the following options for further process:
             1. Add Vehicles
             2. Remove Vehicles
             3. Customize search
             4. Exit
             """);
       int answer = scanner.nextInt();

       switch(answer)
       {
        case 1-> processAddVehicleRequest();
        case 2-> processRemoveVehicleRequest();
        case 3-> processAllVehiclesRequest();
        case 4-> System.exit(0);
        default -> System.out.println("Please re-enter valid input.");
       }

     }
    }

    private void processRemoveVehicleRequest() {

    }

    private void init()
    {
     DealershipFileManager manager = new DealershipFileManager();
        dealership = manager.getDealership();
    }
    private void displayVehicles(ArrayList<Vehicle> listsOfVehicles)
    {
        while(true)
        {
            System.out.println("""
                    WELCOME To the customize search menu
                    Follow the following instructions for further process:
                    1. Get all Vehicles
                    2. Get by Price
                    3. Get by Model
                    4. Get by Year
                    5. Get by Color
                    6. Get by Mileage
                    7. Get by VehicleType
                    8. Return to previous menu
                    """);

            int ans = scanner.nextInt();

                switch (ans)
                {
                    case 1: processGetAllVehiclesRequest();
                    break;
                    case 2: processGetByPriceRequest();
                    break;
                    case 3: processGetByMakeModelRequest();
                    break;
                    case 4: processGetByYearRequest();
                    break;
                    case 5: processGetByColorRequest();
                    break;
                    case 6: processGetByMileageRequest();
                    break;
                    case 7: processGetByVehicleType();
                    break;


                    default: System.out.println("Please re-enter the valid input: ");
                    break;
                }
            }
        }

    private void processGetAllVehiclesRequest() {
     ArrayList<Vehicle> showListOfVehicles = this.dealership.getAllVehicles();
     for(Vehicle vehicle: showListOfVehicles)
     {
         System.out.println("Make: "+ vehicle.getMake()+ "Type: "+ vehicle.getVehicleType());
     }


    }

    private void processGetByMileageRequest() {
    }

    private void processGetByVehicleType() {
    }


    private void processGetByColorRequest() {
    }

    private void processGetByYearRequest() {
    }

    private void processGetByMakeModelRequest() {

    }

    private void processGetByPriceRequest() {
    }

    private void processAllVehiclesRequest ()
    {
        displayVehicles(dealership.getAllVehicles());

    }
   public void processAddVehicleRequest()
   {

   }
}
