package com.exercises.a05_elevator_runs;

public class Elevator {
    /* <summary>
            INSTRUCTIONS:
                * An elevator company has asked you to write a program that determines the least amount of
                times that an elevator must run in order to service a specified number of people.
                * They plan to use this app for all of their elevators (little ones and large ones); therefore,
                    the method accepts the max capacity of the elevator as one of the parameters.
                * the method needs to calculate how many runs total the elevator needs to make and also
                    how people were on the last run

            HINT:
                * in order to solve, you'll need an operator that you've used before

            EXAMPLE:

                |   INPUT             | OUTPUT                          |
                |-------------------------------------------------------|
                | max capacity: 4     |  numberOfRuns: 1                |
                | passengers: 4       |  numberOfPassengersLastRun: 4   |
                |-------------------------------------------------------|
                | max capacity: 3     |  numberOfRuns: 5                |
                | passengers: 17      |  numberOfPassengersLastRun: 2   |
                |-------------------------------------------------------|
                | max capacity: 5     |  numberOfRuns: 1                |
                | passengers: 3      |  numberOfPassengersLastRun: 3    |
                |-------------------------------------------------------|

    */
    public static int[] determineRuns(int max_capacity, int numberOfPassengers){
        int[] container = new int[2]; //this is an array;
        int numberOfRuns = 0;
        int numberOfPassengersLastRun = 0;

        //CALCULATE HERE

        //insert your answers in the appropriate slot of the container
        container[0] = numberOfRuns;
        container[1] = numberOfPassengersLastRun;
        return container;
    }
}
