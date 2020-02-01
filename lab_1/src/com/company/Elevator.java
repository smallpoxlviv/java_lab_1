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

    Elevator(String nameOfProducer, int liftingCapacityInKg, int powerConsumptionInWatt, int numberOfFloors) {
        this(nameOfProducer, liftingCapacityInKg, powerConsumptionInWatt, numberOfFloors, 0, 0, 0, 0);
    }

    Elevator(String nameOfProducer, int liftingCapacityInKg, int powerConsumptionInWatt, int numberOfFloors,
             int numberOfFasteningCables, int height, int length, int width) {
        resetValues(nameOfProducer, liftingCapacityInKg, powerConsumptionInWatt, numberOfFloors,
                    numberOfFasteningCables, height, length, width);
    }

    int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    int getNumberOfFasteningCables() {
        return this.numberOfFasteningCables;
    }

    void setNumberOfFasteningCables(int numberOfFasteningCables) {
        this.numberOfFasteningCables = numberOfFasteningCables;
    }

    static void printStaticHeight() {
        System.out.println("Height: " + height);
    }

    void printHeight() {
        System.out.println("Height: " + height);
    }

    @Override
    public String toString() {
        printHeight();
        return  "Length: " + length + "\n" +
                "Width: " + width + "\n" +
                "Name of the producer: " + "\"" + nameOfProducer + "\"\n" +
                "Lifting capacity: " + liftingCapacityInKg + " kg" + "\n" +
                "Engine power consumption: " + powerConsumptionInWatt + " Watt" + "\n" +
                "Number of floors: " + numberOfFloors + "\n" +
                "Number of fastening cables: " + numberOfFasteningCables + "\n";
    }

    void resetValues(String nameOfProducer, int liftingCapacityInKg, int powerConsumptionInWatt, int numberOfFloors,
                     int numberOfFasteningCables, int height, int length, int width) {
        this.nameOfProducer = nameOfProducer;
        this.liftingCapacityInKg = liftingCapacityInKg;
        this.powerConsumptionInWatt = powerConsumptionInWatt;
        this.numberOfFloors = numberOfFloors;
        this.numberOfFasteningCables = numberOfFasteningCables;
        Elevator.height = height;
        this.length = length;
        this.width = width;
    }
}
