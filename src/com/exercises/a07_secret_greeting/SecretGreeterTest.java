package com.exercises.a07_secret_greeting;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecretGreeterTest {

    @Test
    public void testCase_01() {
        assertEquals("Hola Gonzalo!",
            SecretGreeter.generateSecretGreeting("Gonzalo"));
    }@Test
    public void testCase_02() {
        assertEquals("Hola Mario!",
            SecretGreeter.generateSecretGreeting("mario"));
    }

    @Test
    public void testCase_03() {
        assertEquals("Hola Jenny!",
            SecretGreeter.generateSecretGreeting("jEnNy"));
    }

    @Test
    public void testCase_04() {
        assertEquals("Hola mi amorcito!!",
            SecretGreeter.generateSecretGreeting("Juancho"));
    }

    @Test
    public void testCase_05() {
        assertEquals("Quien eres? No te conozco!",
            SecretGreeter.generateSecretGreeting("Emilia"));
    }

    @Test
    public void testCase_06() {
        assertEquals("Quien eres? No te conozco!",
            SecretGreeter.generateSecretGreeting("emiLia"));
    }

    @Test
    public void testCase_07() {
        assertEquals("Hola mi amorcito!!",
            SecretGreeter.generateSecretGreeting("jUanCho"));
    }
}