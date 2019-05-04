package main.java.com.michalhynek.fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciCalculator {

    private static final Map<Integer, BigInteger> cache = new HashMap<>();

    public static BigInteger calculate(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        } else if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            BigInteger fibNMinus1 = calculate(n - 1);
            BigInteger fibNMinus2 = calculate(n - 2);

            BigInteger result = fibNMinus1.add(fibNMinus2);

            cache.put(n, result);

            return result;
        }
    }
}
