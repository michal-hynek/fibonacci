package test.java.com.michalhynek.fibonacci;

import static org.junit.Assert.assertEquals;

import main.java.com.michalhynek.fibonacci.FibonacciCalculator;

import org.junit.Test;

import java.math.BigInteger;

public class FibonacciCalculatorTest {

    @Test
    public void testCalculate_n0() {
        assertEquals(BigInteger.ZERO, FibonacciCalculator.calculate(0));
    }

    @Test
    public void testCalculate_n1() {
        assertEquals(BigInteger.ONE, FibonacciCalculator.calculate(1));
    }

    @Test
    public void testCalculate_smallNs() {
        assertEquals(BigInteger.valueOf(1), FibonacciCalculator.calculate(2));
        assertEquals(BigInteger.valueOf(2), FibonacciCalculator.calculate(3));
        assertEquals(BigInteger.valueOf(3), FibonacciCalculator.calculate(4));
        assertEquals(BigInteger.valueOf(5), FibonacciCalculator.calculate(5));
        assertEquals(BigInteger.valueOf(8), FibonacciCalculator.calculate(6));
    }

    @Test
    public void testCalcute_largeNs() {
        assertEquals(new BigInteger("190392490709135"), FibonacciCalculator.calculate(70));
        assertEquals(new BigInteger("354224848179261915075"), FibonacciCalculator.calculate(100));
        assertEquals(
            new BigInteger("222232244629420445529739893461909967206666939096499764990979600"),
            FibonacciCalculator.calculate(300)
        );
    }
}
