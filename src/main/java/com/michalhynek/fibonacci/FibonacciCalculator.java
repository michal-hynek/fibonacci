package main.java.com.michalhynek.fibonacci;

import java.math.BigInteger;

public class FibonacciCalculator {

    public static BigInteger calculate(int n) {
        return calculate(n, BigInteger.ZERO, BigInteger.ONE);
    }

    private static BigInteger calculate(int n, BigInteger nMinus2, BigInteger nMinus1) {
        if (n == 0) {
            return nMinus2;
        } else if (n == 1) {
            return nMinus1;
        } else {
            return calculate(n - 1, nMinus1, nMinus1.add(nMinus2));
        }
    }
}
