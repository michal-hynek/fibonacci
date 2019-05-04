package test.java.com.michalhynek.fibonacci;

import static org.junit.Assert.assertEquals;

import main.java.com.michalhynek.fibonacci.FibonacciCalculator;

import org.junit.Test;

public class FibonacciCalculatorTest {

    @Test
    public void testCalculate_forN0() {
        assertEquals(0, FibonacciCalculator.calculate(0));
    }

    @Test
    public void testCalculate_forN1() {
        assertEquals(1, FibonacciCalculator.calculate(1));
    }

    @Test
    public void testCalculate_forSmallNs() {
        assertEquals(1, FibonacciCalculator.calculate(2));
        assertEquals(2, FibonacciCalculator.calculate(3));
        assertEquals(3, FibonacciCalculator.calculate(4));
        assertEquals(5, FibonacciCalculator.calculate(5));
        assertEquals(8, FibonacciCalculator.calculate(6));
    }
}
