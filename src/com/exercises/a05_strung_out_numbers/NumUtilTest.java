package com.exercises.a05_strung_out_numbers;

import com.exercises.a06_elevator_runs.Elevator;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumUtilTest {

    @org.junit.Test
    public void testCase_01() {
        assertEquals(9473.00,
            NumUtil.convertToDouble("9473"),
            .01);
    }

    @org.junit.Test
    public void testCase_02() {
        assertEquals(-34.25,
            NumUtil.convertToDouble("-34.25"),
            .01);
    }

    @org.junit.Test
    public void testCase_03() {
        assertEquals(0,
            NumUtil.convertToDouble("0"),
            .01);
    }

    @org.junit.Test
    public void testCase_04() {
        assertEquals(null,
            NumUtil.convertToDouble(""));
    }

    @org.junit.Test
    public void specialCase_05() {
        assertEquals(null,
            NumUtil.convertToDouble("2e4.7"));
    }

    @org.junit.Test
    public void specialCase_06() {
        assertEquals(null,
            NumUtil.convertToDouble("34T3.8H"));
    }
}