package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testNumeroPrimo() {
        assertTrue(Main.esPrimo(7), "7 debería ser primo");
        assertTrue(Main.esPrimo(13), "13 debería ser primo");
        assertTrue(Main.esPrimo(2), "2 debería ser primo");
    }


    @Test
    public void testNumeroNoPrimo() {
        assertFalse(Main.esPrimo(4), "4 no debería ser primo");
        assertFalse(Main.esPrimo(9), "9 no debería ser primo");
        assertFalse(Main.esPrimo(1), "1 no debería ser primo");
    }


    @Test
    public void testNumeroNegativoOCero() {
        assertFalse(Main.esPrimo(0), "0 no debería ser primo");
        assertFalse(Main.esPrimo(-5), "-5 no debería ser primo");
    }
}