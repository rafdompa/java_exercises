package com.exercises.a03_guessing_game;

import static org.junit.Assert.*;

public class GuessingGameTest {

    @org.junit.Test
    public void testForCar() {
        assertEquals("You won a car!",
            GuessingGame.generatePrizeBasedOnNumber(25));
    }

    @org.junit.Test
    public void testForHouse() {
        assertEquals("You won a house!!",
            GuessingGame.generatePrizeBasedOnNumber(9));
    }

    @org.junit.Test
    public void testForMouse() {
        assertEquals("You won a mouse!",
            GuessingGame.generatePrizeBasedOnNumber(4));
    }

    @org.junit.Test
    public void testForLosing() {
        assertEquals("You lost, play again",
            GuessingGame.generatePrizeBasedOnNumber(7));
    }
}