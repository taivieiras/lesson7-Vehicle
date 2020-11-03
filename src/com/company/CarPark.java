package com.company;

import java.util.ArrayList;

public class CarPark {

//    private ArrayList<Car> listOfCars = new ArrayList<Car>();


    private ArrayList<Vehicle> listOfCars = new ArrayList<Vehicle>();


    public CarPark() {
        MessageCentre.DebugMessage("Creating a CarPark");
    }

    public void ParkVehicle(Vehicle vehicleToPark) {
        listOfCars.add(vehicleToPark);
    }

    public Double CalculateDailyRevenue() {
        Double charge = 5.00;
        Double totalRevenue = 0.0;

        for(Vehicle currentCar:listOfCars) {
            MessageCentre.DebugMessage(String.format("Calculating for %s : %s",currentCar.getManufacturer(), currentCar.getModelName()));
            totalRevenue += charge;

        }

        return totalRevenue;
    }

    @Override
    public String toString() {

        return String.format("The car park has %d cars and daily revenue of %f", listOfCars.size(), CalculateDailyRevenue());
    }
}