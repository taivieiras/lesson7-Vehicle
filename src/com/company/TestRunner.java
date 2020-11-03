package com.company;

public class TestRunner {

    public void Run() {

        RunObjects();
        RunCarPark();

    }

    public void RunCarPark() {
        CarPark carpark = new CarPark();
        Car c1 = new Car();
        Car c2 = new Car("Nissan","Navara");
        Car c3 = new Car("Ford", "Escort");

        carpark.ParkVehicle(c1);
        carpark.ParkVehicle(c2);
        carpark.ParkVehicle(c3);

        Bicycle b1 = new Bicycle();
        carpark.ParkVehicle(b1);

        MessageCentre.DebugMessage(carpark.toString());


    }


    public void RunObjects() {

        // Vehicle v1 = new Vehicle(); // abstract, cannot be instantiated


        Car c1 = new Car();

        Car c2 = new Car("Nissan", "Navara");

        MessageCentre.DebugMessage(c2.toString());

        Bicycle b1 = new Bicycle();

        System.out.println(b1.toString());

        MotorCycle m1 = new MotorCycle();

        RowingBoat rb1 = new RowingBoat();
        rb1.Move(5,"South");

        Plane plane1 = new Plane();

        plane1.Move(240, "North");


    }
}



