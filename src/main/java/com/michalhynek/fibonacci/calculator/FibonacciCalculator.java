package main.java.com.michalhynek.fibonacci.calculator;

import java.math.BigInteger;

/**
 * The class contains a static method to calculate nth Fibonacci number.
 *
 * @author Michal Hynek
 */
public class FibonacciCalculator {

    public static final int UPPER_LIMIT = 9999;

    public static BigInteger calculate(int n) {
        validateN(n);
        return calculateFib(n);
    }

    private static void validateN(int n) {
        if (n < 0 || n > UPPER_LIMIT) {
            throw new IllegalArgumentException(n + " is invalid.  Only non-negative integers less than 10,000 are valid.");
        }
    }

    private static BigInteger calculateFib(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger currentFib = BigInteger.ONE;
            BigInteger[] previousFibs = new BigInteger[]{ BigInteger.ZERO, BigInteger.ONE };

            for (int i = 2; i <= n; i++) {
                // calculate fib(i)
                currentFib = previousFibs[0].add(previousFibs[1]);

                // update fib(i-1) and fib(i-2) for the next iteration of the for loop
                previousFibs[0] = previousFibs[1];
                previousFibs[1] = currentFib;
            }

            return currentFib;
        }
    }
}
