package main.java.com.michalhynek.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.java.com.michalhynek.fibonacci.calculator.FibonacciCalculator;
import main.java.com.michalhynek.fibonacci.util.NumberUtil;

/**
 * The class with the main method for the Fibonacci calculator application.
 *
 * @author Michal Hynek
 */
public class Main {

    public static void main(String[] args) throws IOException {
        printHeader();
        String userInput = getUserInput();

        if (NumberUtil.isInteger(userInput)) {
            int n = Integer.parseInt(userInput);

            for (int i = 0; i < n; i++) {
                System.out.println(FibonacciCalculator.calculate(i));
            }
        } else {
            System.err.println(String.format("Invalid input. Please enter an integer from the interval <0, %d>", FibonacciCalculator.UPPER_LIMIT));
        }
    }

    private static void printHeader() {
        System.out.println("\n---------------------------------------------------------");
        System.out.println("| FIBONACCI CALCULATOR                                  |");
        System.out.println("---------------------------------------------------------\n");
    }

    private static String getUserInput() throws IOException {
        BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter how many Fibonacci numbers you want to print out: ");
        return userInputReader.readLine();
    }
}
