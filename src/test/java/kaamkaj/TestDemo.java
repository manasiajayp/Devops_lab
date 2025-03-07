package kaamkaj;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class TestDemo {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(-8, calculator.add(-5, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(6, calculator.subtract(10, 4));
        assertEquals(-6, calculator.subtract(4, 10));
        assertEquals(-3, calculator.subtract(-5, -2));
    }

    @Test
    public void testMultiply() {
        assertEquals(42, calculator.multiply(6, 7));
        assertEquals(-12, calculator.multiply(-3, 4));
        assertEquals(10, calculator.multiply(-2, -5));
    }

    @Test
    public void testDivide() {
        assertEquals(5.0, calculator.divide(15, 3), 0.001);
        assertEquals(2.5, calculator.divide(10, 4), 0.001);
        assertEquals(-5.0, calculator.divide(-10, 2), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }

    @Test
    public void testModulo() {
        assertEquals(2, calculator.modulo(17, 5));
        assertEquals(-1, calculator.modulo(-10, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModuloByZero() {
        calculator.modulo(10, 0);
    }

    @Test
    public void testPower() {
        assertEquals(8, calculator.power(2, 3));
        assertEquals(9, calculator.power(3, 2));
        assertEquals(1, calculator.power(2, 0));
        assertEquals(1, calculator.power(2, -2));
    }
}