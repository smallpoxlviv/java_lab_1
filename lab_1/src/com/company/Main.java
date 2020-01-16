package com.company;

public class Main {

    public static void main(String[] args) {

        Elevator first = new Elevator();
        Elevator second = new Elevator("Sakura", 300, 45000, 6);
        Elevator third = new Elevator("Malanchack", 500, 62000, 9,
                5, 210, 200, 150);

        System.out.println("--------first elevator---------");
        System.out.println(first);
        System.out.println("-------second elevator--------");
        System.out.println(second);
        System.out.println("--------third elevator--------");
        System.out.println(third);

        System.out.println("height was printed by static function:");
        Elevator.printStaticHeight();
        System.out.println("height was printed by non-static function:");
        first.printHeight();
        System.out.println();

        Elevator[] arrayOfElevators = new Elevator[4];
        int iterator = 0;
        while (iterator < 4) {
            arrayOfElevators[iterator] = new Elevator();
            iterator++;
        }

        iterator = 1;
        for (Elevator itElevator: arrayOfElevators) {
            System.out.println(iterator + " elevator:");
            System.out.println(itElevator);
            iterator++;
        }
    }
}
