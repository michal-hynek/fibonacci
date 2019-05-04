package main.java.com.michalhynek.fibonacci.util;

/**
 * Utility class that checks whether given string is a number.
 *
 * @author Michal Hynek
 */
public class NumberUtil {

    public static boolean isInteger(String s) {
        if (s.isBlank()) {
            return false;
        }

        // allow leading + or -
        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar) && firstChar != '+' && firstChar != '-') {
            return false;
        }

        // check the rest of the string
        for (int i = 1; i < s.toCharArray().length; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
