package com.company;

public class Elevator {
    private static int height;
    protected int length;
    protected int width;
    private String nameOfProducer = "unknown";
    private int liftingCapacityInKg;
    private int powerConsumptionInWatt;

    //additional private fields
    private int numberOfFloors;
    private int numberOfFasteningCables;

    Elevator(){}

    Elevator(String name, int kg, int watts, int floors) {
        this.nameOfProducer = name;
        this.liftingCapacityInKg = kg;
        this.powerConsumptionInWatt = watts;
        this.numberOfFloors = floors;
    }

    Elevator(String name, int kg, int watts, int floors,
             int cables, int height, int length, int width) {
        this(name, kg, watts, floors);
        this.numberOfFasteningCables = cables;
        Elevator.height = height;
        this.length = length;
        this.width = width;
    }

    int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    void setNumberOfFloors(int number) {
        this.numberOfFloors = number;
    }

    int getNumberOfFasteningCables() {
        return this.numberOfFasteningCables;
    }

    void setNumberOfFasteningCables(int cables) {
        this.numberOfFasteningCables = cables;
    }

    static void printStaticHeight() {
        System.out.println("Height: " + height);
    }

    void printHeight() {
        System.out.println("Height: " + height);
    }

    @Override
    public String toString() {
        System.out.println("Name of the producer: " + "\"" + nameOfProducer + "\"");
        System.out.println("Lifting capacity: " + liftingCapacityInKg + " kg");
        System.out.println("Engine power consumption: " + powerConsumptionInWatt + " Watt");
        System.out.println("Number of floors: " + numberOfFloors);
        System.out.println("Number of fastening cables: " + numberOfFasteningCables);
        printHeight();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        return null;
    }

    void resetValues(String name, int kg, int watts, int floors,
                     int cables, int height, int length, int width) {
        this.nameOfProducer = name;
        this.liftingCapacityInKg = kg;
        this.powerConsumptionInWatt = watts;
        this.numberOfFloors = floors;
        this.numberOfFasteningCables = cables;
        Elevator.height = height;
        this.length = length;
        this.width = width;
    }
}
