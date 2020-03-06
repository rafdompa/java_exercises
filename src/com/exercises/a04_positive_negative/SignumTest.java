package com.exercises.a04_positive_negative;

import com.exercises.a03_guessing_game.GuessingGame;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignumTest {

    @org.junit.Test
    public void positiveCase_01() {
        assertEquals("positive",
            GuessingGame.generatePrizeBasedOnNumber(25));
    }

    @org.junit.Test
    public void negativeCase_02() {
        assertEquals("negative",
            GuessingGame.generatePrizeBasedOnNumber(-1));
    }

    @org.junit.Test
    public void unsignedCase_03() {
        assertEquals("unsigned",
            GuessingGame.generatePrizeBasedOnNumber(0));
    }

    @org.junit.Test
    public void positiveCase_04() {
        assertEquals("positive",
            GuessingGame.generatePrizeBasedOnNumber(123445));
    }

    @org.junit.Test
    public void negativeCase_05() {
        assertEquals("negative",
            GuessingGame.generatePrizeBasedOnNumber(-23123445));
    }
}