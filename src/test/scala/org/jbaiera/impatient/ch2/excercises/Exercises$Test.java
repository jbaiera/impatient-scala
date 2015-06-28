package org.jbaiera.impatient.ch2.excercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test Class for Chapter 2 Exercises
 */
public class Exercises$Test {

    @Test
    public void testSignum() throws Exception {
        assertEquals(0, Exercises.signum(0));
        assertEquals(1, Exercises.signum(3));
        assertEquals(-1, Exercises.signum(-40));
    }

    @Test
    public void testStringProduct() throws Exception {
        assertEquals(1, Exercises.stringProduct(""));
        assertEquals(825152896, Exercises.stringProduct("Hello"));
    }

    @Test
    public void testYieldStringProduct() throws Exception {
        assertEquals(1, Exercises.yieldStringProduct(""));
        assertEquals(825152896, Exercises.yieldStringProduct("Hello"));
    }

    @Test
    public void testEasyStringProduct() throws Exception {
        assertEquals(1, Exercises.easyStringProduct(""));
        assertEquals(825152896, Exercises.easyStringProduct("Hello"));
    }

    @Test
    public void testRecursiveStringProduct() throws Exception {
        assertEquals(1, Exercises.recStringProduct(""));
        assertEquals(825152896, Exercises.recStringProduct("Hello"));
    }

    @Test
    public void testPow() throws Exception {
        assertEquals(4.0, Exercises.pow(2, 2), 0.00001);
        assertEquals(32.0, Exercises.pow(2, 5), 0.00001);
    }
}