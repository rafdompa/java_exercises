package com.exercises.a05_elevator_runs;


import static org.junit.Assert.*;

public class ElevatorTest {

    @org.junit.Test
    public void testCase_01() {
        assertEquals(new int[]{1,4},
            Elevator.determineRuns(4, 4));
    }

    @org.junit.Test
    public void testCase_02() {
        assertEquals(new int[]{5,2},
            Elevator.determineRuns(3, 17));
    }

    @org.junit.Test
    public void testCase_03() {
        assertEquals(new int[]{1,3},
            Elevator.determineRuns(5, 3));
    }

    @org.junit.Test
    public void testCase_04() {
        assertEquals(new int[]{0,0},
            Elevator.determineRuns(10, 0));
    }

    @org.junit.Test
    public void testCase_05() {
        assertEquals(new int[]{772,189},
            Elevator.determineRuns(450, 347589));
    }
}