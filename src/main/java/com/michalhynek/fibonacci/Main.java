package main.java.com.michalhynek.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.java.com.michalhynek.fibonacci.calculator.FibonacciCalculator;
import main.java.com.michalhynek.fibonacci.util.NumberUtil;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter n: ");
        String userInput = userInputReader.readLine();

        if (NumberUtil.isInteger(userInput)) {
            int n = Integer.parseInt(userInput);

            for (int i = 0; i < n; i++) {
                System.out.println(FibonacciCalculator.calculate(i));
            }
        } else {
            System.err.println("Invalid input");
        }
    }
}
